package com.metoo.ipnm.core.manager.integrated.monitor;


import com.alibaba.fastjson.JSONObject;
import com.metoo.ipnm.core.service.IGroupService;
import com.metoo.ipnm.core.service.ISysConfigService;
import com.metoo.ipnm.core.utils.NodeUtil;
import com.metoo.ipnm.core.utils.ResponseUtil;
import com.metoo.ipnm.dto.SysWarnMessageModelDto;
import com.metoo.ipnm.dto.SysXxlChDelLogDto;
import com.metoo.ipnm.entity.SysConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("系统相关信息接口")
@RestController
@RequestMapping({"/nspm/monitor/server"})
public class TopoSystemInfoController {

    @Autowired
    private ISysConfigService sysConfigService;
    @Autowired
    private IGroupService groupService;
    @Autowired
    private NodeUtil nodeUtil;

    @PostMapping({"/sysWarnMessage"})
    @ApiOperation("磁盘告警日志")
    public Object listSysWarnMessageLog(@RequestBody SysWarnMessageModelDto dto) throws Exception {
        SysConfig sysConfig = this.sysConfigService.findSysConfigList();
        String token = sysConfig.getNspmToken();
        if(token != null) {
            String url = "/topology-monitor/system/xxlCh/GET/sysWarnMessage";
            Object object = this.nodeUtil.postFormDataBody(dto, url, token);
            JSONObject result = JSONObject.parseObject(object.toString());
            return ResponseUtil.ok(result);
        }
        return ResponseUtil.badArgument();
    }

    @PostMapping({"/xxlChDelLog"})
    @ApiOperation("查询clickHouse表删除记录")
    public Object listXxlChDelLog(@RequestBody SysXxlChDelLogDto dto) throws Exception {
        SysConfig sysConfig = this.sysConfigService.findSysConfigList();
        String token = sysConfig.getNspmToken();
        if(token != null) {
            String url = "/topology-monitor/system/xxlCh/GET/xxlChDelLog";
            Object object = this.nodeUtil.postFormDataBody(dto, url, token);
            JSONObject result = JSONObject.parseObject(object.toString());
            return ResponseUtil.ok(result);
        }
        return ResponseUtil.badArgument();
    }

}

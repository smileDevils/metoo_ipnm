package com.metoo.ipnm.core.manager.view.action;

import com.metoo.ipnm.core.service.ISysConfigService;
import com.metoo.ipnm.core.utils.ResponseUtil;
import com.metoo.ipnm.entity.SysConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api("系统配置")
@RestController
@RequestMapping("/web/config")
public class SysConfigViewController {

    @Autowired
    private ISysConfigService configService;

    @ApiOperation("系统配置")
    @RequestMapping("/detail")
    public Object detail(){
        Map data = new HashMap();
        SysConfig configs = this.configService.findSysConfigList();
        data.put("domain", configs.getDomain());
        data.put("title", configs.getTitle());

        return ResponseUtil.ok(data);
    }
}

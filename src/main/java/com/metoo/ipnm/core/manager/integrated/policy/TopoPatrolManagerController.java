package com.metoo.ipnm.core.manager.integrated.policy;

import com.metoo.ipnm.core.service.ISysConfigService;
import com.metoo.ipnm.core.utils.NodeUtil;
import com.metoo.ipnm.core.utils.ResponseUtil;
import com.metoo.ipnm.entity.SysConfig;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nspm/patrol")
public class TopoPatrolManagerController {

    @Autowired
    private NodeUtil nodeUtil;
    @Autowired
    private ISysConfigService sysConfigService;

    @GetMapping("/downloadFile")
    public Object downloadFile(String url){
        if(!StringUtil.isEmpty(url)){
            url = "patrol/" + url;
            SysConfig sysConfig = this.sysConfigService.findSysConfigList();
            String token = sysConfig.getNspmToken();
            return this.nodeUtil.downloadPatrol(null, url, token);
        }
       return ResponseUtil.badArgument();
    }

}

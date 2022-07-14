package com.metoo.ipnm.core.manager.zabix;

import com.metoo.ipnm.core.service.ISysConfigService;
import com.metoo.ipnm.core.utils.NodeUtil;
import com.metoo.ipnm.core.utils.ResponseUtil;
import com.metoo.ipnm.core.utils.httpclient.UrlConvertUtil;
import com.metoo.ipnm.entity.SysConfig;
import com.metoo.ipnm.entity.ZabbixDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/zabix")
@RestController
public class ZabixHostManagerController {

    @Autowired
    private ISysConfigService sysConfigService;
    @Autowired
    private NodeUtil nodeUtil;
    @Autowired
    private UrlConvertUtil urlConvertUtil;
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping
    public Object host(@RequestBody(required = false) ZabbixDto dto){
        SysConfig sysConfig = this.sysConfigService.findSysConfigList();
        String token = sysConfig.getNspmToken();
        if(token != null){
            String url = "";
            Object result = this.nodeUtil.postBody(dto, url, token);
            return ResponseUtil.ok(result);
        } else {
            return ResponseUtil.error();
        }
    }
}

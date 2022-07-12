package com.metoo.ipnm.core.manager.view.action;

import com.metoo.ipnm.core.service.IBannerService;
import com.metoo.ipnm.core.service.ISysConfigService;
import com.metoo.ipnm.core.utils.ResponseUtil;
import com.metoo.ipnm.entity.Banner;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api("banner")
@RequestMapping("/web/banner")
@RestController
public class BannerViewController {

    @Autowired
    private ISysConfigService configService;
    @Autowired
    private IBannerService bannerService;

    @RequestMapping("/carousel")
    public Object list(){
        Map params = new HashMap();
        params.put("display", 1);
        List<Banner> bannerList = this.bannerService.findObjByMap(params);
        if(bannerList.size() > 0){
            Map data = new HashMap();
            data.put("obj", bannerList);
            return ResponseUtil.ok(data);
        }
        return ResponseUtil.ok();
    }
}

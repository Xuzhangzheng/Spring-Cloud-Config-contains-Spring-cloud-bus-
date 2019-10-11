package configclientjdbc1.configclientjdbc1.controller;

import configclientjdbc1.configclientjdbc1.config.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("baidu")
public class FaceController {

    @Autowired
    private SystemConfig systemConfig;

    @RequestMapping("/baiduInfo")
    public String appId() {
        return systemConfig.getBaiduUrl()+","+systemConfig.getBaiduAppId()+","+systemConfig.getBaiduAppKey();
    }
}
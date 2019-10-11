package configclient1.configclient1.controller;

import configclient1.configclient1.config.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("face")
public class FaceController {

    @Autowired
    private SystemConfig systemConfig;

    @RequestMapping("/appId")
    public String appId() {
        return systemConfig.getFacePlusAppId()+","+systemConfig.getFacePlusAppKey()+","+systemConfig.getFacePlusUrl();
    }
}
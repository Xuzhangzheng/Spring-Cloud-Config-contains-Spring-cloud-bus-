package configclientbus2.configclientbus2.controller;

import configclientbus2.configclientbus2.config.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jkweb")
public class FaceController {

    @Autowired
    private SystemConfig systemConfig;

    @RequestMapping("/getUrl")
    public String getUrl() {
        return "config-client-bus-2:<br/>商户贷地址："+systemConfig.getChannelH5Index()+
                ",<br/>格兰德地址："+systemConfig.getChannelH5Glad()+
                ",<br/>新商帮地址"+systemConfig.getChannelH5NewBusinessTeam();
    }
}
package configclientsvn.configclientsvn.controller;

import configclientsvn.configclientsvn.config.SystemConfig;
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
        return "商户贷地址："+systemConfig.getChannelH5Index()+
                ",<br/>格兰德地址："+systemConfig.getChannelH5Glad()+
                ",<br/>新商帮地址"+systemConfig.getChannelH5NewBusinessTeam();
    }
}
package configclientjdbc1.configclientjdbc1.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@Data
public class SystemConfig {

    @Value("${baidu.url}")
    private String baiduUrl;

    @Value("${baidu.appKey}")
    private String baiduAppKey;

    @Value("${baidu.appId}")
    private String baiduAppId;
}

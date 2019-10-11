package configclient1.configclient1.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@Data
public class SystemConfig {

    @Value("${facePlus.appId}")
    private String facePlusAppId;

    @Value("${facePlus.appKey}")
    private String facePlusAppKey;

    @Value("${facePlus.url}")
    private String facePlusUrl;
}

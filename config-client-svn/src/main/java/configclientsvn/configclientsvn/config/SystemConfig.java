package configclientsvn.configclientsvn.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@Data
public class SystemConfig {

    @Value("${channel.index.h5}")
    private String channelH5Index;

    @Value("${channel.order.h5}")
    private String channelH5Order;

    @Value("${channel.baibuOrder.h5}")
    private String channelH5BaibuOrder;

    @Value("${channel.newBusinessTeam.h5}")
    private String channelH5NewBusinessTeam;

    @Value("${channel.glad.h5}")
    private String channelH5Glad;
}

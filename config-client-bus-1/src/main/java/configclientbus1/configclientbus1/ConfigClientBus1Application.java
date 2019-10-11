package configclientbus1.configclientbus1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientBus1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBus1Application.class, args);
    }

}

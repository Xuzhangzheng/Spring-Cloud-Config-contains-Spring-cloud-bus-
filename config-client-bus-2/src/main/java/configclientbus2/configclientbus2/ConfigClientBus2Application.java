package configclientbus2.configclientbus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientBus2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBus2Application.class, args);
    }

}

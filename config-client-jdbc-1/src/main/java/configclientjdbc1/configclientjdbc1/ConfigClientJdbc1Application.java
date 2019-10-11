package configclientjdbc1.configclientjdbc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientJdbc1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientJdbc1Application.class, args);
    }

}

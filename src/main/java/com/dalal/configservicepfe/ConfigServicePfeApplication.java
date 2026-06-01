package com.dalal.configservicepfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServicePfeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServicePfeApplication.class, args);
    }

}

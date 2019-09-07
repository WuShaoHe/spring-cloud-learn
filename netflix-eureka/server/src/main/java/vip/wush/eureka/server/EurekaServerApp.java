package vip.wush.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServerApp
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/19 18:26
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class, args);
    }

}

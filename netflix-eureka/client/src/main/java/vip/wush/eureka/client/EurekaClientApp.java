package vip.wush.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: EurekaClientApp
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/19 18:53
 */


@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class, args);
    }

}

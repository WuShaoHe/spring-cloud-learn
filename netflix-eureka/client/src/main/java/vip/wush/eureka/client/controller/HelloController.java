package vip.wush.eureka.client.controller;

import org.apache.log4j.Logger;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/19 18:56
 */

@RestController
public class HelloController {

    private final Logger logger= Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/services")
    public List<String> getAllServices(){

        List<String> services = client.getServices();

        return services;
    }


    @GetMapping(value = "/services/instances")
    public List<String> getAllInstance(String serverId){
        List<ServiceInstance>  services = client.getInstances(serverId);

        return services.stream()
                .map(s -> s.getServiceId() + s.getHost()+ ":" +s.getPort())
                .collect(Collectors.toList());
    }




    @GetMapping(value = "/hello")
    public String home(){

        ServiceInstance instance=client.getLocalServiceInstance();

        logger.info("serviceId"+instance.getServiceId()+" host:post="+instance.getHost()+":"+instance.getPort());

        return "hello spring ";
    }



}

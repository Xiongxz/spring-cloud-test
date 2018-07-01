package com.xxz.cloud.springcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启动一个服务注册中心提供给其他应用进行对话
public class SpringCloudTestApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringCloudTestApplication.class, args);
        new SpringApplicationBuilder(SpringCloudTestApplication.class).web(true).run(args);
    }
}

package com.InOneService.GoodsRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoodsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsRegistryApplication.class, args);
	}

}

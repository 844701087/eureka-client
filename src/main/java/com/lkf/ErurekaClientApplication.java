package com.lkf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 通过@EnableDiscoveryClient注解实现让该应用注册为Eureak的客户端，以获得发现服务的能力
 * 	(1)向Eureka Server注册服务实例
 * 	(2)向Eureka Server续约
 * 	(3)当服务关闭期间，向Eureak Server取消租约
 * 	(4)查询Eureka Server中的服务实例列表
 * 	(5)以上操作都是通过发送rest请求进行处理的
 *服务提供者
 *@author: lkf
 *@Date: 2017/7/17 18:35
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ErurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErurekaClientApplication.class, args);
	}
}

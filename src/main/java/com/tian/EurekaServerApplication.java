package com.tian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 通过@EnableEurekaServer注解, 启动一个服务注册中心, 提供给其它应用进行对话.
 * 这一步非常简单, 只需要在普通的springboot应用前面加上该注解就可以启用该功能.
 *
 * 在默认情况下, 该服务注册中心也会将自己做为客户端尝试注册自己, 所以我们需要禁
 * 用它的客户端注册行为. (具体看配置文件)
 *
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}

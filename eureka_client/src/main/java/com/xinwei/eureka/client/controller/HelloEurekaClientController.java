package com.xinwei.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEurekaClientController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		String retMsg = "hello " + name + ", i am from port:" + port;
		System.out.println(retMsg);
		return retMsg;
	}
}

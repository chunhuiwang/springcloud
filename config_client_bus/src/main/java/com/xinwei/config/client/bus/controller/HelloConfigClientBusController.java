package com.xinwei.config.client.bus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloConfigClientBusController {

	@Value("${foo}")
	private String foo;

	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("Hello is ConfigClientBus.");
		return foo;
	}

	// Post http://172.18.10.34:8882/bus/refresh
	// 通过Rabbit消息实现多台Client都更新@Value注入数据
}

package com.xinwei.feign.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xinwei.feign.service.facade.HelloFeignServiceFacade;

@RestController
public class HelloFeignServiceController {

	@Autowired
	private HelloFeignServiceFacade helloFeignServiceFacade;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		System.out.println("Hello is HelloFeignServiceController, name = " + name);
		return helloFeignServiceFacade.sayHelloFromClientOne(name);
	}
}

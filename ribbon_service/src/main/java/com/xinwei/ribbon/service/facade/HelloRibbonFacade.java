package com.xinwei.ribbon.service.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloRibbonFacade {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallbackMethodError")
	public String helloService(String name) {
		return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name=" + name, String.class);
	}

	public String fallbackMethodError(String name) {
		return "hello, " + name + ", sorry, error!";
	}
}

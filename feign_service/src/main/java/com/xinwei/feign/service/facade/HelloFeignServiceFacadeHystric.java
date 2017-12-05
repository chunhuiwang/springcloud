package com.xinwei.feign.service.facade;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignServiceFacadeHystric implements HelloFeignServiceFacade {

	@Override
	public String sayHelloFromClientOne(String name) {
		return "hello, " + name + ", sorry, error!";
	}

}

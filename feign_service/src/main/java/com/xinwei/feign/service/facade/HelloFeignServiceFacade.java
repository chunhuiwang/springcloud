package com.xinwei.feign.service.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = HelloFeignServiceFacadeHystric.class)
public interface HelloFeignServiceFacade {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}

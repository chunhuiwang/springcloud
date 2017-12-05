package com.xinwei.zipkin.client.two.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinClientTwoController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello2")
	public String hello() {
		System.out.println("Calling ZipkinClientTwo.");
		return restTemplate.getForObject("http://172.18.10.34:9412/info1", String.class);
	}

	@RequestMapping("/info2")
	public String info() {
		System.out.println("Calling trace info ZipkinClientTwo.");
		return "I'm ZipkinClientTwo.";
	}
}

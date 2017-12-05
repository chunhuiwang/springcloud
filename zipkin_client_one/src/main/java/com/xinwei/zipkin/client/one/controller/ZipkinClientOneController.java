package com.xinwei.zipkin.client.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinClientOneController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello1")
	public String hello() {
		System.out.println("Calling ZipkinClientOne.");
		return restTemplate.getForObject("http://172.18.10.34:9413/info2", String.class);
	}

	@RequestMapping("/info1")
	public String info() {
		System.out.println("Calling trace info ZipkinClientOne.");
		return "I'm ZipkinClientOne.";
	}
}

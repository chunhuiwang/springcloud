package com.xinwei.zipkin.client.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipkinClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinClientOneApplication.class, args);
	}

	// 两个工程之前凋用时，是以区分Controller请求地址来做ZipKin关系图的

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
}

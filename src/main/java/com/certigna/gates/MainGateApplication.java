package com.certigna.gates;

import com.certigna.gates.filters.ErrorFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.certigna.gates.filters.PostFilter;
import com.certigna.gates.filters.PreFilter;
import com.certigna.gates.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class MainGateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainGateApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}

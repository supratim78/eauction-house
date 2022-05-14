package com.cts.eauction.microservices.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.eauction.microservices.gateway.filter.JwtAuthenticationFilter;

@Configuration
public class GatewayConfig {

	@Autowired
	private JwtAuthenticationFilter filter;
	
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes().route("SELLER-ADD-PRODUCT", r -> r.path("/e-auction/api/v1/seller/add-product/**").filters(f -> f.filter(filter)).uri("http://localhost:8020/"))
				.route("SELLER-DELETE-PRODUCT", r -> r.path("/e-auction/api/v1/seller/delete/**").filters(f -> f.filter(filter)).uri("http://localhost:8020/"))
				.route("BUYER", r -> r.path("/e-auction/api/v1/buyer/**").filters(f -> f.filter(filter)).uri("http://localhost:8040/"))
				.route("LISTING", r -> r.path("/e-auction/api/v1/seller/show-bids/**").filters(f -> f.filter(filter)).uri("http://localhost:8060/"))
				.route("AUTH", r -> r.path("/e-auction/api/v1/user/**").filters(f -> f.filter(filter)).uri("http://localhost:8090/")).build();
	}
}

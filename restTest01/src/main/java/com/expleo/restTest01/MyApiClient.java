package com.expleo.restTest01;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hiRestApi", path = "/hiRestApi")
@RibbonClient(name = "hiRestApi")
public interface MyApiClient {
	
	@GetMapping("/hi/{name}")
	public ResponseEntity<String> hiClient(@PathVariable String name);

}

package com.paypal.demoMicroService;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


	@GetMapping(name = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, String>> demoMethod() {
		return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Hello"));
	}
}

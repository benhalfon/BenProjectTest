package com.example;

import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
	@GetMapping("ben")
	public Object create() {
		return Collections.singletonMap("ben","test");
	}
}

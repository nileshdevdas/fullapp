package com.tsys.fulapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleService {

	@RequestMapping(path = "hello", method = RequestMethod.GET)
	public String hello() {

		return "Hello";
	}
}

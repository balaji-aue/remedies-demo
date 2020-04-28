package com.testapp.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.demo.modal.response.GenericResponse;

@RestController
public class InitController {
	@GetMapping("")
	public Map<String, String> init() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("result", "app is running");
		return result;
	}

	@GetMapping("button/fetch")
	public GenericResponse fetchbutton() {
		return new GenericResponse("App is working");
	}
}

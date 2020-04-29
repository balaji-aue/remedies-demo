package com.testapp.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.demo.modal.response.GenericResponse;

@RestController
public class InitController {

	@GetMapping("button/fetch")
	public GenericResponse fetchbutton() {
		return new GenericResponse("App is working");
	}
}

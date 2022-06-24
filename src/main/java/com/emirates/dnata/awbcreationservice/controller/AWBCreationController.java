package com.emirates.dnata.awbcreationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.dnata.awbcreationservice.dto.AWBCreationResponse;
import com.emirates.dnata.awbcreationservice.model.AWB;
import com.emirates.dnata.awbcreationservice.service.AWBCreationService;

@RestController
@RequestMapping("/dnata")
public class AWBCreationController {

	@Autowired
	private Environment env;
	
	@Autowired
	private AWBCreationService awbService;
	
	@PostMapping("/createAWB")
	public AWBCreationResponse createAWB(@RequestBody AWB awbModel){
		AWBCreationResponse response =  awbService.createAWB(awbModel);
		response.setPort(env.getProperty("server.port"));
		return response;
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}

}

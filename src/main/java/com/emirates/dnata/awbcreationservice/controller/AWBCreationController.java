package com.emirates.dnata.awbcreationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.dnata.awbcreationservice.model.AWB;
import com.emirates.dnata.awbcreationservice.repository.AWBRepository;

@RestController
@RequestMapping("/dnata")
public class AWBCreationController {
	
	@Autowired
	private AWBRepository awbRepo;
	
	@PostMapping("createAWB")
	public String createAWB(@RequestBody AWB awbModel){
		awbRepo.save(awbModel);
		return "SUCCESS";
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}

}

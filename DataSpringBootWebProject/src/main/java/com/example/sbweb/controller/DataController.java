package com.example.sbweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {
	
//	@GetMapping
//	public String getData(@RequestParam String data) {
//		return data;
//	}
	
	@PostMapping
	public String getData(@RequestParam String name,int sub1,int sub2,int sub3,int sub4,int sub5) {
		int sum = sub1+sub2+sub3+sub4+sub5;
		double percentage = (sum/500.00)*100.00;
		return name+" percentage is "+percentage+"%";
	}
}

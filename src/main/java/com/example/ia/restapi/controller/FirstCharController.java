package com.example.ia.restapi.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ia.restapi.entity.FirstChar;
import com.example.ia.restapi.service.FirstCharService;

@RestController
public class FirstCharController {
	
	@Autowired
	private FirstCharService firstCharService;

	@RequestMapping("/firstChar") 
	public FirstChar firstChar(@RequestParam(value="text", defaultValue="") String text) {
		long start = System.currentTimeMillis();
		
		if ("".equals(text)) 
			return new FirstChar("", new Timestamp(System.currentTimeMillis() - start));
		
		return firstCharService.verifyFirstChar(text, start);
	}
	
}

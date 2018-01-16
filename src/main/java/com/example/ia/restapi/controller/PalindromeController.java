package com.example.ia.restapi.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ia.restapi.entity.Palindrome;
import com.example.ia.restapi.service.PalindromeService;

@RestController
public class PalindromeController {
	
	@Autowired
	private PalindromeService palindromeService;

	@RequestMapping("/palindrome")
	public Palindrome palindromeGet(@RequestParam(value="word", defaultValue="") String word) {
		long start = System.currentTimeMillis();
		
		if ("".equals(word)) 
			return palindromeService.save(new Palindrome(false, new Timestamp(System.currentTimeMillis() - start)));
		
		return palindromeService.validatePalindrome(word, start);
	}

}

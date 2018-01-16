package com.example.ia.restapi.service;

import com.example.ia.restapi.entity.Palindrome;

public interface PalindromeService extends AbstractService<Palindrome> {

	Palindrome validatePalindrome(String word, long start);
	
}

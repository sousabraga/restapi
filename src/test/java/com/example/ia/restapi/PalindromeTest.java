package com.example.ia.restapi;

import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.ia.restapi.entity.Palindrome;
import com.example.ia.restapi.service.PalindromeService;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeTest {

	@Mock
	private static PalindromeService palindromeService;
	
	@Test
	public void validatePalindromeTest() {
		long start = System.currentTimeMillis();
		
		Mockito.when(palindromeService.validatePalindrome(Mockito.anyString(), Mockito.anyLong()))
			.thenReturn(new Palindrome(true, new Timestamp(System.currentTimeMillis() - start)));
		
		Palindrome palindrome = palindromeService.validatePalindrome("arara", System.currentTimeMillis());
		
		Assert.assertTrue(palindrome.isPalindrome());
	}
	
}

package com.example.ia.restapi.service.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ia.restapi.entity.Palindrome;
import com.example.ia.restapi.repository.PalindromeRepository;
import com.example.ia.restapi.service.PalindromeService;

@Service
public class PalindromeServiceImpl implements PalindromeService, Serializable {

	private static final long serialVersionUID = 8837644920461514558L;

	@Autowired
	private PalindromeRepository palindromeRepository;
	
	@Override
	public Palindrome findOne(Long id) {
		return palindromeRepository.findOne(id);
	}

	@Override
	public List<Palindrome> findAll() {
		return palindromeRepository.findAll();
	}

	@Override
	public Palindrome save(Palindrome palindrome) {
		return palindromeRepository.save(palindrome);
	}

	@Override
	public void delete(Palindrome palindrome) {
		palindromeRepository.delete(palindrome);
	}

	@Override
	public Palindrome validatePalindrome(String word, long start) {
		StringBuilder builder = new StringBuilder(word);

		long end = System.currentTimeMillis();

		return save(new Palindrome(builder.reverse().toString().equals(word), new Timestamp(end - start)));
	}
	
}

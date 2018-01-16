package com.example.ia.restapi.service.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ia.restapi.entity.FirstChar;
import com.example.ia.restapi.repository.FirstCharRepository;
import com.example.ia.restapi.service.FirstCharService;

@Service
public class FirstCharServiceImpl implements FirstCharService, Serializable {

	private static final long serialVersionUID = -5649307531852869405L;

	@Autowired
	private FirstCharRepository firstCharRepository;
	
	@Override
	public FirstChar findOne(Long id) {
		return firstCharRepository.findOne(id);
	}

	@Override
	public List<FirstChar> findAll() {
		return firstCharRepository.findAll();
	}

	@Override
	public FirstChar save(FirstChar firstChar) {
		return firstCharRepository.save(firstChar);
	}

	@Override
	public void delete(FirstChar firstChar) {
		firstCharRepository.delete(firstChar);
	}

	@Override
	public FirstChar verifyFirstChar(String text, long start) {
		char[] characters = text.toCharArray();
		StringBuilder builder = new StringBuilder("");
		String firstChar = "";
		
		for (int i = 0; i < text.length(); i++) {
			builder.append(text);
			builder.deleteCharAt(i);

			if (builder.toString().contains(String.valueOf(characters[i])) == false) {
				firstChar = String.valueOf(characters[i]);
				break;
			}
			
			builder.delete(0, builder.toString().length());
		}
		
		long end = System.currentTimeMillis();
		
		return save(new FirstChar(firstChar, new Timestamp(end - start)));
	}

}

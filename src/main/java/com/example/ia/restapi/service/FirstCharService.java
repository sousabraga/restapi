package com.example.ia.restapi.service;

import com.example.ia.restapi.entity.FirstChar;

public interface FirstCharService extends AbstractService<FirstChar> {

	FirstChar verifyFirstChar(String text, long start);
	
}

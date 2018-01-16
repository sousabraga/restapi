package com.example.ia.restapi;

import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.ia.restapi.entity.FirstChar;
import com.example.ia.restapi.service.FirstCharService;

@RunWith(MockitoJUnitRunner.class)
public class FirstCharTest {

	@Mock
	private FirstCharService firstCharService;
	
	@Test
	public void verifyFirstCharTest() {
		long start = System.currentTimeMillis();
		
		Mockito.when(firstCharService.verifyFirstChar(Mockito.anyString(), Mockito.anyLong()))
			.thenReturn(new FirstChar("b", new Timestamp(System.currentTimeMillis() - start)));
	
		FirstChar firstChar = firstCharService.verifyFirstChar("aabcc", start);
	
		Assert.assertTrue("b".equals(firstChar.getFirstChar()));
	}
	
}

package com.paypal.demoMicroService;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoMicroServiceApplicationTest{
	
	@Autowired
	private DemoWebServiceResource resource;

	@Test
	public void contextLoads() throws JSONException {
		String actual = resource.fetchValue();
		
		JSONAssert.assertEquals("{'message':'Hello'}", actual, false);
	}

}
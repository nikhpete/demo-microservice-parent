package com.paypal.demoMicroService;

import static io.restassured.RestAssured.given;

import org.springframework.stereotype.Component;

import io.restassured.http.ContentType;

@Component
public class DemoWebServiceResource{

	public String fetchValue() {
		return given().port(8080)
		        .when().get("demo/")
		        .then().statusCode(200).contentType(ContentType.JSON).extract().asString();
	}
	
}

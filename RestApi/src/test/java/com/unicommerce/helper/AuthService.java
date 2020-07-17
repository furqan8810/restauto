package com.unicommerce.helper;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthService {
	 public static String oauthtoken(){
	Response response= given()
			 .queryParam("grant_type", "password")
			 .queryParam("client_id","my-trusted-client").queryParam("username", "karun@unicommerce.com").queryParam("password", "uniware").when().get("https://stgenterprise1.unicommerce.com/oauth/token");
			// .when().get("http://example.com/building");
	 //String jsonBody = response.getBody().asString();
	 JsonPath jsResp = new JsonPath(response.asString());
	 String token = jsResp.get("access_token");
	 return token;
	}
	
}

package com.unicommerce.test;


import static io.restassured.RestAssured.given;

import com.unicommerce.resources.ApiResources;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.unicommerce.helper.BaseTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetSaleOrder extends BaseTest {
	@Test
	public void getSaleOrderDetails() {


		apires=ApiResources.valueOf("getSaleOrderApi");
		Response response = given().header("Content-Type", "application/json").header("Authorization", access_token)
				.body("{\"code\":\"SO1007289\"}").when().post(apires.getResource()).then()
				.statusCode(200).extract().response();
		JsonPath jsResp = new JsonPath(response.asString());
		int count = jsResp.get("saleOrderDTO.size()");
       System.out.println(response.asString());
		System.out.println(count);
		Assert.assertTrue(jsResp.get("saleOrderDTO.displayOrderCode").equals("SO1007289"));
		Assert.assertTrue(jsResp.get("saleOrderDTO.shippingPackages.code[0]").equals("06P1048277"));
		Assert.assertTrue(jsResp.get("saleOrderDTO.shippingPackages.code[1]").equals("06P1048276"));
	}
}

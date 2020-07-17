package com.unicommerce.test;

import static io.restassured.RestAssured.given;

import com.unicommerce.resources.ApiResources;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.unicommerce.helper.BaseTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.uniware.core.api.item.*;
public class GetItemTypeDetail extends BaseTest {
    @Test
    public void getItemTypeDetails() {


        apires= ApiResources.valueOf("getItemTypeDetailApi");
        RequestSpecification response=given().spec(req).body("{\"itemSKU\":\"testing1212\"}");
        GetItemTypeDetailResponse response2=response.when().post(apires.getResource()).as(GetItemTypeDetailResponse.class);
        System.out.println("Channel="+response2.getItemTypeDTO().getCategoryName());
        System.out.println(""+response2.getItemTypeDTO().getSkuCode());
        Assert.assertTrue(response2.getItemTypeDTO().getSkuCode().equalsIgnoreCase("testing1212"));



    }
}

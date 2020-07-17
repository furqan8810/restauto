package com.unicommerce.test;

import static io.restassured.RestAssured.given;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.unicommerce.utils.DbQuery;
import com.uniware.core.api.model.WsAddressDetail;
import com.uniware.core.api.model.WsAddressRef;
import com.uniware.core.api.model.WsSaleOrder;
import com.uniware.core.api.model.WsSaleOrderItem;
import com.uniware.core.api.saleorder.CreateSaleOrderRequest;
import com.uniware.core.api.saleorder.CreateSaleOrderResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.unicommerce.helper.BaseTest;

import com.uniware.core.api.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateSaleOrder extends BaseTest {
	@Test
	public void createSaleOrder() throws SQLException {


		String code= DbQuery.getOrderCode();
		System.out.println(code);

		WsSaleOrder saleorder = new WsSaleOrder();
		saleorder.setCode(String.valueOf(Integer.parseInt(code)+1));
		saleorder.setChannel("CUSTOM");

		// saleorder.setDisplayOrderDateTime(new Date());
		saleorder.setCashOnDelivery(true);
		saleorder.setCurrencyCode("INR");
		List<WsAddressDetail> ws = new ArrayList<WsAddressDetail>();
		WsAddressDetail dd = new WsAddressDetail();
		dd.setName("mohd furqan");
		dd.setAddressLine1("okhla");
		dd.setCity("delhi");
		dd.setPincode("110020");
		dd.setPhone("8976876756");
		dd.setCountry("IN");
		dd.setState("DL");
		dd.setId("1");
		ws.add(dd);

		saleorder.setAddresses(ws);
		WsAddressRef addref = new WsAddressRef();
		addref.setReferenceId("1");

		saleorder.setBillingAddress(addref);
		saleorder.setShippingAddress(addref);
		List<WsSaleOrderItem> orderitem = new ArrayList<WsSaleOrderItem>();
		WsSaleOrderItem item = new WsSaleOrderItem();
		item.setItemName("shirt");
		item.setItemSku("testing1212");
		item.setShippingMethodCode("STD");
		item.setSellingPrice(new BigDecimal(700.54));
		item.setShippingCharges(new BigDecimal(0));
		item.setTotalPrice(new BigDecimal(700.54));
		item.setShippingMethodCharges(new BigDecimal(0));
		item.setChannelTransferPrice(new BigDecimal(0));
		item.setShippingAddress(addref);
		item.setFacilityCode("06");
		item.setCode("TESTING1212-0");
		item.setPacketNumber(0);
		orderitem.add(item);
		saleorder.setSaleOrderItems(orderitem);
		CreateSaleOrderRequest csr=new CreateSaleOrderRequest();
		csr.setSaleOrder(saleorder);
		System.out.println(saleorder);
		//Gson gson = new Gson();

		//String json = gson.toJson(new CreateSaleOrderRequest(saleorder));
		//System.out.println(json);

		CreateSaleOrderResponse response = given().header("Content-Type", "application/json").header("Authorization", access_token)
				.header("facility", "06").body(csr).when().post("/services/rest/v1/oms/saleOrder/create").as(CreateSaleOrderResponse.class);
		//System.out.println(response.asString());
		//JsonPath jsResp = new JsonPath(response.getSaleOrderDetailDTO().);
		//System.out.println(jsResp);

		//System.out.println(jsResp.get("successful"));
		System.out.println(response.getSaleOrderDetailDTO().getCode());


	}

}

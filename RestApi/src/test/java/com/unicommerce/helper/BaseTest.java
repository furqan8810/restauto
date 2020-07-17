package com.unicommerce.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.unicommerce.config.FileUtil;
import com.unicommerce.resources.ApiResources;
import com.unicommerce.utils.DbQuery;
import com.unicommerce.utils.dbUtil;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseTest {

	public static String access_token;
	public static String baseUrl;
	public static Connection connection;
	public static ApiResources apires;
	public static RequestSpecification req;

	String environment;
	FileUtil fu = new FileUtil();

	public static dbUtil du = new dbUtil();
	public static DbQuery dq = new DbQuery();

	  @BeforeSuite
	  public void beforeSuite() throws IOException {
		  System.out.println("in before suite");

		  RestAssured.baseURI= fu.getConstants("baseUrl");
		access_token="bearer "+AuthService.oauthtoken();
		System.out.println(access_token);
		   req= new RequestSpecBuilder().setBaseUri("http://stgenterprise1.unicommerce.com").setContentType("application/json").addHeader("Authorization", access_token).build();
		//baseUrl=fu.getConstants("AdminUrl");
		  fu.getConstants("dbUrl");
		  try {
			  connection = du.getConnection(fu.getConstants("dbUrl"));
		  } catch (ClassNotFoundException e1) {
			  // TODO Auto-generated catch block
			  e1.printStackTrace();
		  } catch (SQLException e1) {
			  // TODO Auto-generated catch block
			  e1.printStackTrace();
		  }
		  try {
		  } catch (Exception e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  }
	  }

	  @AfterSuite (alwaysRun = true)
	  public void afterSuite() throws SQLException {
		  System.out.println("in after suite closing db connection");
		  connection.close();
		 
}
}
package RestApi.RestApi;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Response response = given().queryParam(grant_type=password&client_id=my-trusted-client&username=karun@unicommerce.com&password=uniware);
			        /*header("Authorization", noneToken).
			        header("X-API-KEY", apiKey).
			        param("query", "").
			        param("authors", ReusableMethods.authorsFilter()).
			        when().
			        get(Resource.searchProfile());
	}*/
		Response response= given()
				 .queryParam("grant_type", "password")
				 .queryParam("client_id","my-trusted-client").queryParam("username", "karun@unicommerce.com").queryParam("password", "uniware").when().get("https://stgenterprise1.unicommerce.com/oauth/token");
				// .when().get("http://example.com/building");
		JsonPath jsResp = new JsonPath(response.asString());
		 System.out.println(jsResp.getString("access_token"));
}
}
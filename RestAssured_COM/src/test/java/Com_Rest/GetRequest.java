package Com_Rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://www.google.com";
		
		RequestSpecification requestSpecification=RestAssured.given();
		
		Response response=requestSpecification.get();
		
		System.out.println(response.asString());

	}

}

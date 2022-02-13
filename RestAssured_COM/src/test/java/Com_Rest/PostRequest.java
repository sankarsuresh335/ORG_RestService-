package Com_Rest;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="http://139.59.91.96:3000";
		
		RequestSpecification requestSpecification =RestAssured.given();
		
		Header header = new Header("Content-Type", "application/json");
		
		requestSpecification.header(header);
		requestSpecification.body("{\r\n"
				+ "\"email\": \"jatinvsharma@gmail.com\",\r\n"
				+ "\"password\": \"123123123\"\r\n"
				+ "}");
		
		Response response=requestSpecification.post("/user/signin");
		
		System.out.println(response.asString());
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getSessionId());
		
	
				

	}

}

package api.call;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiCalls {
	public ApiCalls(String url1, String url2) {
		
		String Response1 = makeRequest(url1);
		String Response2 = makeRequest(url2);
		compareResponse(Response1, Response2);
		 
	}
	
	public String makeRequest(String url) {
		RestAssured.baseURI = "https://reqres.in/api/users/3";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 Response response = httpRequest.request(Method.GET, "");
		
		 return response.getBody().asString();
	}
	
	public String compareResponse(String respoonse1, String response2) {
		
		return "response is same";
		
	}

}

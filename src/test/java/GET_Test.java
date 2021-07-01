import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Test {

	@Test
	void test(){
		Response res = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		System.out.println(res.getContentType());
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusCode());
		 
		
		  int statusCode = res.getStatusCode(); 
		  Assert.assertEquals(statusCode, 200);
		 
	}
	
	
	
}

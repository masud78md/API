import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_test {

	@Test
	void test1() {

		Response res1 = RestAssured.delete("http://dummy.restapiexample.com/api/v1/delete/2");
		System.out.println(res1.asPrettyString());
		System.out.println(res1.getStatusCode());

		int statusCode = res1.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}
}

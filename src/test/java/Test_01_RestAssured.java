import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_01_RestAssured {

	@Test
	void test_01()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		//response.getBody();
		//response.getHeaders();
		
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	
}

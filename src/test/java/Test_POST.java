import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_POST {
	
	@Test
////	public void test_1_post()
////	{
//////		Map<String,Object> map = new HashMap<String,Object>();
//////		map.put("name","Neeta");
//////		map.put("job", "Teacher");
//////		
//////		System.out.println(map);
////		
////		JSONObject request = new JSONObject();
////		request.put("name", "neeta");
////		request.put("job","Teacher");
////		
////		System.out.println(request.toJSONString());
////		
////		given().
////		body(request.toJSONString()).
////		when().
////		post("https://reqres.in/api/users").
////		then().
////		statusCode(201).log().all();
////		
////	}
////	
//	
//	public void test_2_put()
//	{
////		Map<String,Object> map = new HashMap<String,Object>();
////		map.put("name","Neeta");
////		map.put("job", "Teacher");
////		
////		System.out.println(map);
//		
//		JSONObject request = new JSONObject();
//		request.put("name", "neeta");
//		request.put("job","Teacher");
//		
//		System.out.println(request.toJSONString());
//		
//		given().
//		body(request.toJSONString()).
//		when().
//		put("https://reqres.in/api/users/2").
//		then().
//		statusCode(200).log().all();
//		
//	}
//	
//	public void test_2_put()
//	{
////		Map<String,Object> map = new HashMap<String,Object>();
////		map.put("name","Neeta");
////		map.put("job", "Teacher");
////		
////		System.out.println(map);
//		
//		JSONObject request = new JSONObject();
//		request.put("name", "neeta");
//		request.put("job","Teacher");
//		
//		System.out.println(request.toJSONString());
//		
//		given().
//		body(request.toJSONString()).
//		when().
//		put("https://reqres.in/api/users/2").
//		then().
//		statusCode(200).log().all();
//		
//	}
	
	public void test_3_delete()
	{
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("name","Neeta");
//		map.put("job", "Teacher");
//		
////		System.out.println(map);
//		
//		JSONObject request = new JSONObject();
//		request.put("name", "neeta");
//		request.put("job","Teacher");
//		
//		System.out.println(request.toJSONString());
		
//		given().
//		body(request.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).log().all();
		
	}


}

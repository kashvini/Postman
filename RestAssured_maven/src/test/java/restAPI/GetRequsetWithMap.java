package restAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class GetRequsetWithMap {
    
    public void GetCall() {
        
        RestAssured.baseURI = "http://localhost:7000";
        
        RequestSpecification request = RestAssured.given();
        Map<String,Object> PostBody =new HashMap<String,Object>();
        PostBody.put("name","ashvini");
        PostBody.put("salary","4000");
        
        Response response = request.contentType(ContentType.JSON)
        		                    .accept(ContentType.JSON)
        		                    .body(PostBody)
        		                     .post("employees/create");
        String ResponseBody = response.body().asString();
        System.out.println(ResponseBody);
        
        //=============Verify the Response code================
        int ActResponse = response.statusCode();
        int ExpResponse = 201;
        
        Assert.assertEquals(ActResponse, ExpResponse);
    }
}


package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class PostRequest {
    
    public void GetCall() {
        
        RestAssured.baseURI = "http://localhost:7000";
        
        RequestSpecification request = RestAssured.given();
        
        Response response = request.contentType(ContentType.JSON)
        		                    .accept(ContentType.JSON)
        		                    .body("{\n"
        		                    		+ "    \"name\": \"Rohit\",\n"
        		                    		+ "    \"salary\": \"8000\"\n"
        		                    		+ "}")
        		                     .post("employees/create");
        String ResponseBody = response.body().asString();
        System.out.println(ResponseBody);
        
        //=============Verify the Response code================
        int ActResponse = response.statusCode();
        int ExpResponse = 201;
        
        Assert.assertEquals(ActResponse, ExpResponse);
    }
}

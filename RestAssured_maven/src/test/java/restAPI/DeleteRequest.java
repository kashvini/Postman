package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class DeleteRequest {
    
    public void DeleteCall() {
        
        RestAssured.baseURI = "http://localhost:7000";
        
        RequestSpecification request = RestAssured.given();
        
        Response response = request.get("/employees/8");
        //String ResponseBody = response.body().asString();
        //System.out.println(ResponseBody);
        int ActResponse=response.statusCode();
        int ExpResponse =200;
        Assert.assertEquals(ActResponse,ExpResponse);
    }
}
     
package restAPI;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class PostCallWithJSONFile {
    
    public void GetCall() throws IOException {
        
        RestAssured.baseURI = "http://localhost:7000";
        
        RequestSpecification request = RestAssured.given();
      String JSONBody  =ReadJSONFile("data.json");
    
        
        Response response = request.contentType(ContentType.JSON)
        		                    .accept(ContentType.JSON)
        		                    .body(JSONBody)
        		                     .post("employees/create");
        String ResponseBody = response.body().asString();
        System.out.println(ResponseBody);
        
        //=============Verify the Response code================
        int ActResponse = response.statusCode();
        int ExpResponse = 201;
        
        Assert.assertEquals(ActResponse, ExpResponse);
        JsonPath jpath = response.jsonPath();
        
        String ActName = jpath.get("name");
        String ExpName = "ashvini";
        Assert.assertEquals(ActName, ExpName);
    }
    //public String ReadJSONFile(String FileName) throws IOException {
    	//String data =new String (Files.readAllBytes(Paths.get(FileName)));
		//return FileName;

	private String ReadJSONFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
    	
    
 
    






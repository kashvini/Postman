package restAPIBDD;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequset {

	@Test
	public void PostCall() {
		Map<String,Object> PostBody =new HashMap<String,Object>();
        PostBody.put("name","ashvini");
        PostBody.put("salary","4000");
      
    		RestAssured.given()
    		           .baseUri("https://localhost:700")
    		            .contentType(ContentType.JSON)
	                    .accept(ContentType.JSON)
	                    .body(PostBody)
	                    .when()
	                    .post("employees/create")
    		            .then()
    		           .statusCode(201)
    		         
    		           .log()
    		           .all();
    	}
    		


	}


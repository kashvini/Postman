package restAPIBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequset {

	
	@Test
	public void DeleteCall() {
		 
				RestAssured.given()
				           .baseUri("https://localhost:700")
				           .when()
				           .delete("/employees/11")
				           .then()
				           .statusCode(200);
				           
				
			}
				


	
}

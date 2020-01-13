package Test_CIand.rest.test;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.Test;
import Test_CIandT.rest.core.BaseTest;


public class UserTest extends BaseTest {

	@Test
	public void findUserOne() {
		given()
		.when()
			.get("/1")
		.then()
			.statusCode(200)
			;
	}
	
	@Test
	public void checkPasswordtUser3() {
		given()
		.when()
			.get("/3")
		.then()
			.statusCode(200)
			.body("Password", Matchers.is("Password3"))
			;
		
	}
	
}

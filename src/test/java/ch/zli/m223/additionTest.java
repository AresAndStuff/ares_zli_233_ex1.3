package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class additionTest {

    @Test
    public void testAddNumbersEndpoint() {
        RestAssured.given()
                .when().get("/add/12/30")
                .then()
                .statusCode(200)
                .body(equalTo("The sum is: 42"));
    }
}

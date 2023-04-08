package com.qacart;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCase {
    @Test
    public void test(){
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("todos")
                .then().log().all()
                .assertThat().statusCode(200);

    }
}

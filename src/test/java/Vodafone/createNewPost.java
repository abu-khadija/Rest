package Vodafone;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class createNewPost {
    @Test
    public void Post(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .body("""
                        {
                          "title": "foo",
                          "body": "bar",
                          "userId": 1
                        }""")
                .when().post("posts")
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("id", equalTo(101));

    }
}

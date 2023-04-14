package Vodafone;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPostByID {
    private int id = 1;
    @Test
    public void Get(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .when().get("posts/"+id)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));

    }
}

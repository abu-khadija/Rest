package Vodafone;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getallPosts {


    //Get All Posts
    @Test
    public void test(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .when().get("posts")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("[1].title", equalTo("qui est esse"));
    }
}

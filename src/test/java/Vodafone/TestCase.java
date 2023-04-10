package Vodafone;


import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCase {
    private int id = 1;


    //Get All Posts
    @Test
    public void test(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .when().get("posts")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    //Get Post by id
    @Test
    public void test1(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .when().get("posts/"+id)
                .then().log().all()
                .assertThat().statusCode(200);
    }

//    @Test
//    public void test2(){
//        JSONObject jsonObj = new JSONObject();
//
//        jsonObj.put("userId", 50);
//        jsonObj.put("title", "islam");
//        jsonObj.put("body", "testing");
//        given().baseUri("https://jsonplaceholder.typicode.com/")
//                .body(jsonObj)
//                .when().post("posts")
//                .then().log().all()
//                .assertThat().statusCode(201);
//    }
}

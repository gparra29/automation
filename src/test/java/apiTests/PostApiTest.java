package apiTests;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostApiTest {
    @Test
    public void testPostExample(){
        given().
                contentType(ContentType.JSON).body("{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}").log().body().
        when().
                post( "https://reqres.in/api/register").
        then().
                assertThat().statusCode(200).log().all();
    }
}

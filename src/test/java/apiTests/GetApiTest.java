package apiTests;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetApiTest {

    @Test
    public void testGetExample(){
        given().
                when().
                get( "https://reqres.in/api/users/2").
                then().
                assertThat().statusCode(200).log().all();
    }
}

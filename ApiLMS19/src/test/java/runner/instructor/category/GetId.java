package runner.instructor.category;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetId {
    private String url, token, id;

    public void setUrl(){
        url ="http://13.213.47.36/instructor/category/get_by_id/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzEzMDk0NDd9.BjmNAR8DnsDYwQq2HOtt8exR0JEGmMyuA-UV5RZo37c";
        id ="4481406aaa2d47e184c7535c7977243c";
    }
    public void requestId(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url + id);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success get category by id"));
    }
}

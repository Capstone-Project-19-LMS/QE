package runner.instructor.category;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetId {
    private String url, token, id;

    public void setUrl(){
        url ="https://gencer.live/instructor/category/get_by_id/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE2OTE4NzN9.O00LrDtNUKZuCJO2EVcrp68jhUsPUH4njJIhv9P9rls";
        id ="a7011e06bed24a00b9bc53bd66afe47c";
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

package runner.instructor.course;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAll {
    private String url, token;
    public void setUrl(){
        url = "https://gencer.live/instructor/course/get_all";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE2OTk2NzR9.A8aX02Z2kV8S9oKbvzgpYoYq3QpDWlzUoXJgdWbScek";
    }
    public void requestGetAll(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success get all courses"));
    }


}

package runner.instructor.course.enroll;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class GetEnroll {
    private String url, id, token;

    public void setUrl(){
        url ="http://13.213.47.36/instructor/course/get_by_id/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzA2OTM3ODJ9.x_JY_SaqDK-3FDckB1WDtayw_Ic-iP7kMhkpqK4SpEA";
        id = "0fd47b533e1e46318dcab63761d95eb7";
    }
    public void requestEnroll(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url + id + "/enroll");
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success get course with customer enrolled"));
    }
}

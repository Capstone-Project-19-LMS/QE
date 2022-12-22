package runner.instructor.course;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class Delete {
    private String url, token, id1, id2;
    public void setUrl(){
        url = "https://gencer.live/instructor/course/delete/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE2OTk2NzR9.A8aX02Z2kV8S9oKbvzgpYoYq3QpDWlzUoXJgdWbScek";
        id1="add39f035bb6457f9cc7b4a3ff5156ed";
        id2="b37464868bca4203ae130d873a409e201";
    }
    public void requestDelete(){
        given().header("Authorization", "Bearer " + token)
                .when().delete( url + id1);
    }
    public void requestDeleteInv(){
        given().header("Authorization", "Bearer " + token)
                .when().delete( url + id2);
    }
    public void requestDeleteInvToken(){
        given()
                .when().delete( url + id2);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void statusCode404(){
        then().statusCode(404);
    }
    public void statusCode400(){
        then().statusCode(400);
    }
    public void validate200(){
        then().body("message", equalTo("success delete course"));
    }
    public void validate404(){
        then().body("message", equalTo("fail delete course"));
    }
    public void validate400(){
        then().body("message", equalTo("missing or malformed jwt"));
    }
}

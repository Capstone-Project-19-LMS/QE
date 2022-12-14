package runner.instructor.course;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class Delete {
    private String url, token, id;
    public void setUrl(){
        url = "http://13.213.47.36/instructor/course/delete/";
        token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzA2MDkyNzh9.LILCGa7LmzB8vs5kSmdzHwtmiX_x6-6SloHlJ3CEwyo";
        id="92be263df78b487ca7aeeb828d21a473";
    }
    public void requestDelete(){
        given().header("Authorization", "Bearer " + token)
                .when().delete( url + id);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success delete course"));
    }
}

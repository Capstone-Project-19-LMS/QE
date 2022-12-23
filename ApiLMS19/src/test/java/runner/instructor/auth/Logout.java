package runner.instructor.auth;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Logout {
    private String url, token;

    public void setUrl(){
        url = "https://gencer.live/instructor/logout";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTM3NTl9.7VGQt2Nf3g52sBcbkbhaf1RMcer471tTMtVV_26AQWg";
    }
    public void request(){
        given().header("Authorization", "Bearer " + token)
                .when().post(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void validateBody(){
        then().body("message", equalTo("logout success"));
    }
}

package runner.instructor.auth;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Logout {
    private String url, token;

    public void setUrl(){
        url = "http://13.213.47.36/instructor/logout";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzA5OTQwMDZ9.-94oZ0J_QAG8DatmV4Bp5UQSioTX0pLbrBB2EAkoUjs";

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

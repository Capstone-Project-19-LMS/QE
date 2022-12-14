package runner.instructor.category;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class Delete {
    private String url, token, id;

    public void setUrl(){
        url = "http://13.213.47.36/instructor/category/delete/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzA5OTQwMDZ9.-94oZ0J_QAG8DatmV4Bp5UQSioTX0pLbrBB2EAkoUjs";
        id = "b91e6fdf3e1249b7a4ae15c52cc9bcb1";
    }
    public void requestDelete(){
        given().header("Authorization", "Bearer " + token)
                .when().delete(url + id);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success delete account"));
    }
}

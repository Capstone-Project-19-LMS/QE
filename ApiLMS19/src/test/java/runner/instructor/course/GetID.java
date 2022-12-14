package runner.instructor.course;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class GetID {
    private String url, token, id;

    public void setUrl(){
        url ="http://13.213.47.36/instructor/course/get_by_id/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzA5OTQwMDZ9.-94oZ0J_QAG8DatmV4Bp5UQSioTX0pLbrBB2EAkoUjs";
        id ="de9170a38caf4e588f6bef26b29b884d";
    }
    public void requestId(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url + id);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success get course by id"));
    }
}

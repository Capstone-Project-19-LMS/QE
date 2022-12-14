package runner.instructor.category;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;



public class Create {
    private String url, token;

    public void setUrl(){
        url = "http://13.213.47.36/instructor/category/create";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzA5OTQwMDZ9.-94oZ0J_QAG8DatmV4Bp5UQSioTX0pLbrBB2EAkoUjs";

    }
    public JSONObject bodyCategory(){
//        if(name.equals("valid")){
//
//        }else if (name.equals("duplicate")){
//            name = "coba";
//        }
        JSONObject body = new JSONObject();
        body.put("name", "coba 6");
        body.put("description", "mencoba testing category coba 6");
        return body;
    }
    public void requestBody(){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyCategory())
                .when().post(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void validateBody200(){
        then().body("message", equalTo("success create category"));
    }
}

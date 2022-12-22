package runner.instructor.category;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;



public class Create {
    private String url, token;

    public void setUrl(){
        url = "https://gencer.live/instructor/category/create";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE2OTE4NzN9.O00LrDtNUKZuCJO2EVcrp68jhUsPUH4njJIhv9P9rls";
    }
    public JSONObject bodyCategory(){
//        if(name.equals("valid")){
//
//        }else if (name.equals("duplicate")){
//            name = "coba";
//        }
        JSONObject body = new JSONObject();
        body.put("name", "coba 10");
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

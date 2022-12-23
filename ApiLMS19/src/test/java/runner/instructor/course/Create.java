package runner.instructor.course;

import org.json.simple.JSONObject;
import runner.utils.InstGeneratedString;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.*;

public class Create {
    private String url, token;

    public void setUrl(){
        url = "https://gencer.live/instructor/course/create";
        //token nya pake punya naixxy
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTQyMTh9.EjAHxkRYn9GbrCYhfiyTedSwq7JHBPyTE-BR1oDo_AU";

    }
    public JSONObject bodyCourse(String name, String  desc, String objective, String catId){
        //String capacity, String catId, String instructorId
        InstGeneratedString igs = new InstGeneratedString();
        if(name.equals("valid")) {
            name = igs.randomName();
        }else if(name.equals("duplicate")){
            name = "java";
        }
        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", desc);
        body.put("objective", objective);
        body.put("capacity", 15);
        body.put("category_id", catId);
        return body;
    }
    public void requestBody(String name, String  desc, String objective, String catId){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyCourse(name, desc, objective, catId))
                .when().post(url);
    }
    public void requestBodyWithoutToken(String name, String  desc, String objective, String catId) {
        given()
                .header("Content-Type", "application/json")
                .body(bodyCourse(name, desc, objective, catId))
                .when().post(url);
    }
    public void requestBodyInvalid(String name, String  desc, String objective, String catId) {
        given().header("Authorization", "Bearer " + "abc")
                .header("Content-Type", "application/json")
                .body(bodyCourse(name, desc, objective, catId))
                .when().post(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void verifStatusCode400(){
        then().statusCode(400);
    }
    public void verifStatusCode401(){
        then().statusCode(401);
    }

    public void verifStatusCode500(){
        then().statusCode(500);
    }
    public void validateBody200(){
        then().body("message", equalTo("success create course"));
    }
    public void validateBody500(){
        then().body("message", equalTo("fail create course"));
    }
    public void validateBody400(){
        then().body("message", equalTo("There is an empty field"));
    }
    public void validateBody401(){
        then().body("message", equalTo("missing or malformed jwt"));
    }

}

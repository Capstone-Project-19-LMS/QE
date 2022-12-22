package runner.instructor.course;

import org.json.simple.JSONObject;
import runner.utils.InstGeneratedString;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Update {
    private String url, token, id1, id2;
    public void setUrl(){
        url ="https://gencer.live/instructor/course/update/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE2OTk2NzR9.A8aX02Z2kV8S9oKbvzgpYoYq3QpDWlzUoXJgdWbScek";
        id1 ="b8442e1dccdf4ead96d43df9ce28511a";
        id2 ="de9170a38caf4e588f6bef26b29b884d";
    }
    public JSONObject updateBodyCourse(String name, String  desc, String objective, String catId){
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
        body.put("price", 15000);
        body.put("category_id", catId);
        return body;
    }
    public void requestUpdateBody(String name, String  desc, String objective, String catId){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(updateBodyCourse(name, desc, objective, catId))
                .when().put(url + id1);
    }
    public void requestUpdateBodyInvalid(String name, String  desc, String objective, String catId){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(updateBodyCourse(name, desc, objective, catId))
                .when().put(url + id2);
    }
    public void requestUpdateBodyInvToken(String name, String  desc, String objective, String catId){
        given()
                .header("Content-Type", "application/json")
                .body(updateBodyCourse(name, desc, objective, catId))
                .when().put(url + id1);
    }

    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void verifStatusCode400(){
        then().statusCode(400);
    }
    public void verifStatusCode404(){
        then().statusCode(404);
    }
    public void validateBody200(){
        then().body("message", equalTo("success update course"));
    }
    public void validateBody404(){
        then().body("message", equalTo("fail update course"));
    }
    public void validateBody400(){
        then().body("message", equalTo("missing or malformed jwt"));
    }

}

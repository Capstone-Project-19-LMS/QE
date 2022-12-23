package runner.instructor.auth;

import org.json.simple.JSONObject;
import runner.utils.InstGeneratedString;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Register {
    private String url;

    public void setUrl(){
        url = "https://gencer.live/instructor/register";

    }
    public JSONObject bodyRegister(String name, String email, String password){
        JSONObject body = new JSONObject();
        InstGeneratedString igs = new InstGeneratedString();
        if (email.equals("valid")){
            email = igs.randomEmailInstructor();
        }else if (email.equals("duplicate")){
            email = "naixxy@gmail.com";
        }else if(email.equals("null")){
            email = "";
        }
        body.put("name", name);
        body.put("email", email);
        body.put("password", password);
        return body;
    }
    public void requestBody(String name, String email, String password){
        given().header("Content-Type", "application/json")
                .body(bodyRegister(name, email, password).toJSONString())
                .when().post(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void verifStatusCode400(){
        then().statusCode(400);
    }
    public void verifStatusCode500(){
        then().statusCode(500);
    }
    public void validateBody(){
        then().body("message", equalTo("success create instructor"));
    }

    public void validateBody400(){
        then().body("message", equalTo("There is an empty field"));
    }
    public void validateBodyDuplicate(){
        then().body("message", equalTo("fail create instructor"));
    }
}

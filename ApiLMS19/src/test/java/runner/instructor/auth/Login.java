package runner.instructor.auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Login {
    private String url;

    public void setUrl(){
        url = "https://gencer.live/instructor/login";
    }
    public JSONObject bodyLogin(String email, String password){
        JSONObject body = new JSONObject();
        if (email.equals("valid")){
            email = "naixxy@gmail.com";
        }else if(email.equals("null")){
            email = "";
        }else if(password.equals("null")){
            password = "";
        }
        body.put("email", email);
        body.put("password", password);
        return body;
    }
    public void requestBody(String email, String password){
        given().header("Content-Type", "application/json")
                .body(bodyLogin(email, password).toJSONString())
                .when().post(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void verifStatusCode500(){
        then().statusCode(500);
    }
    public void validateBody(){
        then().body("message", equalTo("success login"));
    }
    public void validateBodyFailed(){
        then().body("message", equalTo("fail login"));
    }
}

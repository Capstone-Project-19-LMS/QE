package runner.instructor.course.enroll;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class UpdateEnroll {
    private String url, id, token;

    public void setUrl(){
        url ="https://gencer.live/instructor/course/enroll/update/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTQyMTh9.EjAHxkRYn9GbrCYhfiyTedSwq7JHBPyTE-BR1oDo_AU";
        id = "0fd47b533e1e46318dcab63761d95eb7";
    }
    public JSONObject bodyUpdate(){
        JSONObject body = new JSONObject();
        body.put("customer_id", "67d9c7fec2a44237919a8caee5b37555");
        body.put("status", true);
        return body;
    }
    public void requestUpdateEnroll(){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyUpdate().toJSONString())
                .when().put(url + id);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success update enrollment status"));
    }
}

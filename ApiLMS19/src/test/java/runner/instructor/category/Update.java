package runner.instructor.category;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Update {
    private String url, token, id;
    public void setUrl(){
        url = "https://gencer.live/instructor/category/update/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTQyMTh9.EjAHxkRYn9GbrCYhfiyTedSwq7JHBPyTE-BR1oDo_AU";
        id = "09a65e7b400a459cb951391f9305b1b5";
    }
    public JSONObject updateBodyCategory() {
        JSONObject body = new JSONObject();
        body.put("name", "coba 9");
        body.put("description", "programming language anaconda for industry");
        return body;
    }
    public void requestUpdateBody(){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(updateBodyCategory())
                .when().put(url + id);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void validateBody200(){
        then().body("message", equalTo("success update category"));
    }

}

package runner.instructor.category;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class GetAll {
    private String url, token;

    public void setUrl(){
        url = "https://gencer.live/instructor/category/get_all";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTQyMTh9.EjAHxkRYn9GbrCYhfiyTedSwq7JHBPyTE-BR1oDo_AU";

    }
    public void requestGetAll(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success get all category"));
    }
}

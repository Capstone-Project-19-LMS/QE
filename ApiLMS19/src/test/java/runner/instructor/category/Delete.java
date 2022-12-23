package runner.instructor.category;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class Delete {
    private String url, token, id;

    public void setUrl(){
        url = "https://gencer.live/instructor/category/delete/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTQyMTh9.EjAHxkRYn9GbrCYhfiyTedSwq7JHBPyTE-BR1oDo_AU";
        id = "f489cda429e04c01b51ad6aa67818146";
    }
    public void requestDelete(){
        given().header("Authorization", "Bearer " + token)
                .when().delete(url + id);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void validate200(){
        then().body("message", equalTo("success delete category"));
    }
}

package runner.instructor.course;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;


public class GetID {
    private String url, token, id1,id2;

    public void setUrl(){
        url ="https://gencer.live/instructor/course/get_by_id/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFmMTRmMDQ2NDBkYTRlODNhYmRiOTk3ZDgwYTJmYzFiIiwicm9sZSI6Imluc3RydWN0b3IiLCJleHAiOjE2NzE3OTQyMTh9.EjAHxkRYn9GbrCYhfiyTedSwq7JHBPyTE-BR1oDo_AU";
        id1 ="d042093beb5e4628ac4e47c6588773ca";
        id2 ="d042093beb5e";
    }
    public void requestId(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url + id1);
    }
    public void requestIdInvalid(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url + id2);
    }
    public void statusCode200(){
        then().statusCode(200);
    }
    public void statusCode404(){then().statusCode(404);}

    public void validate200(){
        then().body("message", equalTo("success get course by id"));
    }
    public void validate404(){then().body("message", equalTo("fail get course by id"));}
}

package tests;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class votesGetBySubIdTest extends DogsConfig {

    @DisplayName("getting votes by Sub Id.")
    @Test
    public void getVotesBySubID(){


        given()
                .queryParam("sub_id","my-user-1232")
                .when()
                .get(Endpoints.votes)
                .then()
                .log()
                .all()
        ;

    }

    @DisplayName("get by image id")
    @Test

    public void getVotesByImageId(){

        given()
                .when()
                .get(Endpoints.votes+4)
                .then()
                .body("image.id",equalTo("B1i67l5VQ"))
                .log()
                .all()
        ;

    }
}

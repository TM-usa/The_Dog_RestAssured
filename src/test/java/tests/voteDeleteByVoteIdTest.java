package tests;

import config.DogsConfig;
import config.Endpoints;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class voteDeleteByVoteIdTest extends DogsConfig {
    String vote_id;

    @DisplayName("delete vote by vote_id")
    @Test
    public void deleteByVoteId(){

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();

        given()
                .when()
                .delete(Endpoints.Fav+"vote_id")
                .then();

    }


}

package tests;

import config.DogsConfig;
import config.Endpoints;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class votesUpPostTest extends DogsConfig {
    @DisplayName("creating a vote Up Json object")
    @Test
    public void testThatICanCreateVoteUp(){

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();

        String voteBodyVJson ="{\n" +
                "\t\"image_id\":\"jhfbvuufb\",\n" +
                "\t\"sub_id\": \"my-user-1234\",\n" +
                "\t\"value\":1\n" +
                "}";

        given()
                .body(voteBodyVJson)
                .when()
                .post(Endpoints.votes)
                .then()
                .body("message",equalTo("SUCCESS"))
                .log()
                .all()

        ;
    }



}

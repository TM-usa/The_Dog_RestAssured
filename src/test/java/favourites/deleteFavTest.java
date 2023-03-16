package favourites;

import config.DogsConfig;
import config.Endpoints;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class deleteFavTest extends DogsConfig {
    @DisplayName("getting favourite by Id.")
    @Test
    public void deleteFavourite(){
         String favourite_id;

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();

        given()
                .when()
                .delete(Endpoints.Fav+"favourite_id")
                .then();

    }
}

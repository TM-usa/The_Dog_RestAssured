package tests;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class breedsGetByIdTest extends DogsConfig {
    @DisplayName("getting breeds by Id.")
    @Test
    public void getBreedsByBreedId(){

        given()

                .when()
                .get(Endpoints.breeds+3)
                .then()
                .body("height.metric", equalTo("76"))
                .log()
                .all()
        ;

    }
}

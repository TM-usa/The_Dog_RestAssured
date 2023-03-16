package tests;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;

public class breedsGetByLimitTest extends DogsConfig {
    @DisplayName("getting breeds by parameter limit.")
    @Test
    public void getBreedsBySubId(){
        String Limit = "10";
        given()
                .queryParam("limit",Limit)
                .when()
                .get(Endpoints.breeds)
                .then().log().all();

    }

    @DisplayName("Check if JSON body has Afghan Hound")
    @Test
    public void getNameMatch(){
        given()
                .when()
                .get(Endpoints.breeds)
                .then()
                .body("name", hasItem("Afghan Hound"));

    }

    @DisplayName("Check if JSON body does not have Thapelo Nghayo")
    @Test
    public void getNameNotInJson(){
        given()
                .when()
                .get(Endpoints.breeds)
                .then()
                .body("name", hasItem("Thapelo Nghayo"))
        ;

    }



}

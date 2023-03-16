package tests;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class favouriteGetByFavouriteIdTest extends DogsConfig {

    @DisplayName("getting by favourite Id.")
    @Test
    public void getByFavouriteId(){

        given()
                .when()
                .get(Endpoints.Fav);


    }
}

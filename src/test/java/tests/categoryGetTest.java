package tests;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class categoryGetTest extends DogsConfig {
    String categories;
    @DisplayName("getting categories")
    @Test
    public void getCategory(){

        given()
                .when()
                .get(Endpoints.categories)
                .then()
        ;
    }

}

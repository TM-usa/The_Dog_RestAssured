package favourites;

import com.fasterxml.jackson.core.PrettyPrinter;
import config.DogsConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class getFavouriteBySubIdTest extends DogsConfig {
    @DisplayName("getting favourite dog by sub Id.")
    @Test
    public void getFavouriteDogUsingSubId(){

        given()
                .queryParam("sub_id","my-user-1234")
                .when()
                .get("favourites/");

    }
}

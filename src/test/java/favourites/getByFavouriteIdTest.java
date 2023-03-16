package favourites;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class getByFavouriteIdTest extends DogsConfig {

    @DisplayName("getting favourite by Id.")
    @Test
    public void getByFavouriteId(){

        given()
                .when()
                .get(Endpoints.Fav);


    }
}

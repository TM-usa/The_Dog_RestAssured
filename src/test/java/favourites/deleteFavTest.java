package favourites;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class deleteFavTest extends DogsConfig {
    @DisplayName("getting favourite by Id.")
    @Test
    public void deleteFavourite(){
        given()
                .when()
                .delete(Endpoints.Fav+8)
                .then();

    }
}

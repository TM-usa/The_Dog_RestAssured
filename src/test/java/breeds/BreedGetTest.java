package breeds;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BreedTest extends DogsConfig {
    @DisplayName("getting breeds by sub Id.")
    @Test
    public void getBreedsBySubId(){
        given()
                .queryParam("limit",10)
                .when()
                .get(Endpoints.breeds);
    }

}

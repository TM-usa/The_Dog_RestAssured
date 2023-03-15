package breeds;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class getByLimitTest extends DogsConfig {
    @DisplayName("getting breeds by parameter limit.")
    @Test
    public void getBreedsBySubId(){
        given()
                .queryParam("limit",10)
                .when()
                .get(Endpoints.breeds);
    }

}

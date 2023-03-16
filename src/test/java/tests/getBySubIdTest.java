package tests;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class getBySubIdTest extends DogsConfig {
    @DisplayName("getting favourite dog by sub Id.")
    @Test
    public void getFavouriteDogUsingSubId(){

        given()
                .queryParam("sub_id","your-user-1234")
                .when()
                .get(Endpoints.Fav)
                .then()
                .log()
                .all()
        ;

    }
    @DisplayName("getting all favourites")
    @Test
    public void getFavouriteDogs(){
          given()
                  .urlEncodingEnabled(false)
                  .queryParam("sub_id")
                  .when().get(Endpoints.Fav)
          ;
    }


}

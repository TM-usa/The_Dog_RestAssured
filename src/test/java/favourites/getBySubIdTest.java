package favourites;

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
                .get(Endpoints.Fav);

    }
    @DisplayName("getting all favourites by sub_id")
    @Test
    public void getFavouriteDogs(){
          given()
                  .urlEncodingEnabled(false)
                  .queryParam("sub_id")
                  .when().get(Endpoints.Fav);
    }


}

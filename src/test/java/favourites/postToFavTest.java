package favourites;

import config.DogsConfig;
import config.Endpoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;


public class postToFavTest extends DogsConfig {
    @DisplayName("creating a favourite with a sub_id")
    @Test
    public void createNewFavouriteSubId(){
        String favouriteBodyJson = "{\n" +
                "\t\"image_id\":\"98445huf8kb\",\n" +
                "\t\"sub_id\": \"I-am-a-tester\"\n" +
                "}";
        given()
                .body(favouriteBodyJson)
                .when()
                .post(Endpoints.Fav)
                .then()
                .body("message", equalTo("SUCCESS"));
    }

    @DisplayName("Check if Favourite with sub_id = I-am-a-tester is created ")
    @Test
    public void checkForThePresenceOfTheNewlyCreatedJson(){
        given()

                .when()
                .get(Endpoints.Fav)
                .then()
                .body("sub_id", hasItem("I-am-a-tester"));
    }



}

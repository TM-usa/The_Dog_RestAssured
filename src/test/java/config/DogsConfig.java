package config;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeEach;

public class DogsConfig {
  @BeforeEach
  public void setup(){
    //Favourites//Votes//Categories//Breeds

    RestAssured.requestSpecification = new RequestSpecBuilder()
            .setBaseUri(constants.baseURI)
            .addHeader("x-api-key", constants.api_Key)
            .setContentType("application/json")
            .setAccept("application/json")
            .addFilter(new RequestLoggingFilter())
            .addFilter(new ResponseLoggingFilter())
            .build().filter(new AllureRestAssured());


    //Response for all
    RestAssured.responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();
  }
}

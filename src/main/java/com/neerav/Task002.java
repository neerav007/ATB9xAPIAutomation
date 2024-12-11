package com.neerav;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Task002 {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        given()
                .basePath("/booking")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200)
                .body("size()", greaterThan(0)); // Validates that the response body contains data
    }
}




package org.example;

import io.restassured.RestAssured;

public class ApiTest002 {
    //Gerkin Syntax
    //Full URL :https://restful-booker.herokuapp.com/booking/1
    //Base URI : https://restful-booker.herokuapp.com
    // Base Path :/booking/1

    public static void main(String[] args) {
        RestAssured
                .given()
                        .baseUri("https://restful-booker.herokuapp.com")
                         .basePath("/booking/1")
                .when()
                       .get()
                .then().log().all()
                .statusCode(200);

    }


}

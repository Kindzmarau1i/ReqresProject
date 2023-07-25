package common;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class Specification {

    public static ResponseSpecification responseStatusCode(Integer status_code) {
        return new ResponseSpecBuilder()
                .expectStatusCode(status_code)
                .build();
    }

    public static void installation(ResponseSpecification responseStatusCode) {
        RestAssured.responseSpecification = responseStatusCode;
    }
}

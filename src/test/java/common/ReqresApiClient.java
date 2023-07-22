package common;

import io.restassured.response.Response;
import requestsDTO.RegisterRequestDTO;

import static io.restassured.RestAssured.given;

public class ReqresApiClient implements ReqresApi {

    private final String URL = "https://reqres.in/api/";

    @Override
    public Response registerUser(RegisterRequestDTO requestBody) {
        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post(URL + "register")
                .then()
                .extract().as(Response.class);
        return response;
    }

    @Override
    public Response getUser(Integer qwery) {
        Response response = given()
                .when()
                .get(URL + "users/" + qwery)
                .then()
                .extract().as(Response.class);
        return response;
    }
}
package common;

import io.restassured.response.Response;
import requestsDTO.RegisterRequestDTO;
import responsesDTO.ErrorResponseDTO;
import responsesDTO.RegisterResponseDTO;

import static io.restassured.RestAssured.given;

public class ReqresApiClient implements ReqresApi {

    private final String URL = "https://reqres.in/api/";

    @Override
    public RegisterResponseDTO registerUser(RegisterRequestDTO requestBody) {
        return given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post(URL + "register")
                .then()
                .extract().as(RegisterResponseDTO.class);
    }

    @Override
    public ErrorResponseDTO registerUserFail(RegisterRequestDTO requestBody) {
        return given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post(URL + "register")
                .then()
                .extract().as(ErrorResponseDTO.class);
    }

    @Override
    public Response getUser(Integer qwery) {
        return given()
                .when()
                .get(URL + "users/" + qwery)
                .then()
                .extract().as(Response.class);
    }
}
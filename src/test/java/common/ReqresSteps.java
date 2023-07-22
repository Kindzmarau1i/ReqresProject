package common;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import requestsDTO.RegisterRequestDTO;
import responsesDTO.ErrorResponseDTO;
import responsesDTO.RegisterResponseDTO;
import responsesDTO.SingleUserResponseDTO;

public class ReqresSteps {

    private ReqresApi reqresApi;

    public RegisterResponseDTO registerUser(RegisterRequestDTO requestBody) {
        Response response = reqresApi.registerUser(requestBody);
        Assertions.assertEquals(response.statusCode(), 200);
        return response.as(RegisterResponseDTO.class);
    }

    public ErrorResponseDTO failRegisterUser(RegisterRequestDTO requestBody) {
        Response response = reqresApi.registerUser(requestBody);
        Assertions.assertEquals(response.statusCode(), 400);
        return response.as(ErrorResponseDTO.class);
    }

    public SingleUserResponseDTO getUser(Integer qwery) {
        Response response = reqresApi.getUser(qwery);
        Assertions.assertEquals(response.statusCode(), 200);
        return response.as(SingleUserResponseDTO.class);
    }
}

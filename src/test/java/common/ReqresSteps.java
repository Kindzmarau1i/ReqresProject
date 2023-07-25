package common;

import requestsDTO.RegisterRequestDTO;
import responsesDTO.ErrorResponseDTO;
import responsesDTO.RegisterResponseDTO;

public class ReqresSteps {

    private final ReqresApi reqresApi = new ReqresApiClient();

    public RegisterResponseDTO registerUser(RegisterRequestDTO requestBody) {
        Specification.installation(Specification.responseStatusCode(200));
        return reqresApi.registerUser(requestBody);
    }

    public ErrorResponseDTO failRegisterUser(RegisterRequestDTO requestBody) {
        Specification.installation(Specification.responseStatusCode(400));
        return reqresApi.registerUserFail(requestBody);
    }
}

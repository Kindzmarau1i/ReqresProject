package common;

import io.restassured.response.Response;
import requestsDTO.RegisterRequestDTO;
import responsesDTO.ErrorResponseDTO;
import responsesDTO.RegisterResponseDTO;

public interface ReqresApi {

    /**
     * Регистрация клиента
     */
    RegisterResponseDTO registerUser(RegisterRequestDTO requestBody);

    /**
     * Неуспешная регистрация клиента
     */
    ErrorResponseDTO registerUserFail(RegisterRequestDTO requestBody);

    /**
     * Получение информации по клиенту
     */
    Response getUser(Integer qwery);
}
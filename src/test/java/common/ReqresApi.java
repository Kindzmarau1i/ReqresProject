package common;

import io.restassured.response.Response;
import requestsDTO.RegisterRequestDTO;

public interface ReqresApi {

    /**
     * Регистрация клиента
     */
    Response registerUser(RegisterRequestDTO requestBody);

    /**
     * Получение информации по клиенту
     */
    Response getUser(Integer qwery);
}
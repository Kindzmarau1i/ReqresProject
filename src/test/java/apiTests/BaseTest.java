package apiTests;

import common.ReqresSteps;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import requestsDTO.RegisterRequestDTO;
import responsesDTO.ErrorResponseDTO;
import responsesDTO.RegisterResponseDTO;

public class BaseTest {

    ReqresSteps reqresSteps = new ReqresSteps();

    @Tag("Positive")
    @Step("Проверка регистрации клиента")
    @Test
    public void test_01() {
        // Регистрация клиента
        RegisterResponseDTO registerResponseDTO = reqresSteps.registerUser(RegisterRequestDTO.builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build());

        // Проверка на непустой ответ
        Assertions.assertNotNull(registerResponseDTO.getId());
        Assertions.assertNotNull(registerResponseDTO.getToken());
    }

    @Tag("Negative")
    @Step("Проверка неуспешной регистрации клиента")
    @Test
    public void test_02() {
        // Регистрация клиента
        ErrorResponseDTO registerResponseDTO = reqresSteps.failRegisterUser(RegisterRequestDTO.builder()
                .email("sydney@fife")
                .build());

        // Проверка ответа ошибки
        Assertions.assertEquals(registerResponseDTO.getError(), "Missing password");
    }
}

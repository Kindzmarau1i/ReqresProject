package responsesDTO;

public class ErrorResponseDTO {
    private String errorMessage;

    public ErrorResponseDTO(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getError() {
        return errorMessage;
    }
}

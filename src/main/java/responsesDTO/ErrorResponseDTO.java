package responsesDTO;

public class ErrorResponseDTO {
    private String error;

    public ErrorResponseDTO(String errorMessage) {
        this.error = errorMessage;
    }

    public ErrorResponseDTO() {}

    public String getError() {
        return error;
    }
}

package responsesDTO;

public class RegisterResponseDTO {
    private Integer id;
    private String token;

    public RegisterResponseDTO(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public RegisterResponseDTO() {}

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
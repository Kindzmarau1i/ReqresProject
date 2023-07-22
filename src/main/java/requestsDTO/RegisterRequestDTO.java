package requestsDTO;

public class RegisterRequestDTO {
    private String email;
    private String password;

    public RegisterRequestDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static RegisterRequestDTOBuilder builder() {
        return new RegisterRequestDTOBuilder();
    }

    public static class RegisterRequestDTOBuilder {
        private String email;
        private String password;

        public RegisterRequestDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        public RegisterRequestDTOBuilder password(String password) {
            this.password = password;
            return this;
        }

        public RegisterRequestDTO build() {
            return new RegisterRequestDTO(email, password);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

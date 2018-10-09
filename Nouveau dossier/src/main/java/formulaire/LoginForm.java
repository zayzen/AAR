package formulaire;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoginForm {
    @NotNull @NotBlank String login;
    @NotNull @NotBlank String motdepasse;

    // Constructor
    public LoginForm() {
    }

    // Getters & Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
}

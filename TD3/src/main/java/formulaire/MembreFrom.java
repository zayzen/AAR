package formulaire;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MembreFrom {
    @NotNull @NotBlank String login;
    @NotNull @NotBlank String motdepasse;
    @NotNull @NotBlank String surnom;

    // Constructor
    public MembreFrom() {
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

    public String getSurnom() {
        return surnom;
    }
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
}

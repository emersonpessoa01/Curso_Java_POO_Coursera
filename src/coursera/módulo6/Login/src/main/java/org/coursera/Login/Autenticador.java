package org.coursera.Login;

public class Autenticador {
    public Usuario logar(String login, String senha) throws LoginException {
        if ("guerra".equals(login) && "senhadoguerra".equals(senha)) {
            return new Usuario(login);
        } else {
            throw new LoginException(login, senha);
        }
    }
}

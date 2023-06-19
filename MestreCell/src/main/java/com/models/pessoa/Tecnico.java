package src.main.java.com.models.pessoa;

import src.main.java.com.interfaces.login.Login;

public class Tecnico extends Pessoa implements Login{
    private String especialidade, senhaLogin;
    private boolean logado;

    public Tecnico(String nome, String sobreNome, int idade, String especialidade, String senhaLogin, boolean logado) {
        super(nome, sobreNome, idade);
        this.especialidade=especialidade;
        this.senhaLogin=senhaLogin;
        this.logado=logado;
        
    }

    @Override
    public boolean logarTecnico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logarTecnico'");
    }

    @Override
    public boolean deslogarTecnico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deslogarTecnico'");
    }


    
}

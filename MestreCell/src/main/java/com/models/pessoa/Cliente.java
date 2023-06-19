package src.main.java.com.models.pessoa;

public class Cliente extends Pessoa {
    private String endereco, telefone;

    public Cliente(String nome, String sobreNome, int idade, String endereco, String telefone) {
        super(nome, sobreNome, idade);
        this.endereco=endereco;
        this.telefone=telefone;
    }
    
}

package herancapolimorfismo;

public class FuncionarioAutenticavel extends Funcionario {

    private String senha;

    public FuncionarioAutenticavel(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String senha){
        return senha == getSenha();
    }
}

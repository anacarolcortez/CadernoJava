package herancapolimorfismo;

public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return super.salario * 0.3;
    }


}

package herancapolimorfismo;

public class Gerente extends FuncionarioAutenticavel {

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario, senha);
    }

    @Override
    public double getBonificacao(){
        return super.salario * 0.3;
    }


}

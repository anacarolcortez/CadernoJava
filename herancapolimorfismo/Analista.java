package herancapolimorfismo;

public class Analista extends Funcionario {

    public Analista(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao(){
        return super.salario * 0.2;
    }


}

package herancapolimorfismo;

public class Diretor extends Funcionario {

    private String senha;

    public Diretor(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return super.salario * 0.5;
        //poderia acessar o salário pelo método get, contudo. Não precisaria deixar o atributo protected na classe mãe
    }


}

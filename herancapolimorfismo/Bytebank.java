package herancapolimorfismo;

public class Bytebank {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Nico", "333.333.333-33", 5000);

        System.out.println("Funcionário: " + funcionario.getNome() + " receberá bonificação de R$" + funcionario.getBonificacao());

    }

}


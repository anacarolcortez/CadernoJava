package herancapolimorfismo;

public class Bytebank {

    public static void main(String[] args) {
        //polimorfismo
        Funcionario analista = new Analista ("Lala", "222.222.222-22", 2000);
        Funcionario gerente = new Gerente("Dipsy", "333.333.333-33", 5000, "lol123");
        Funcionario diretor = new Diretor ("Tinky Winky", "444.444.444-44", 15000, "blob123");

        System.out.println("Gerente: " + analista.getNome() + " receberá bonificação de R$" + analista.getBonificacao());
        System.out.println("Gerente: " + gerente.getNome() + " receberá bonificação de R$" + gerente.getBonificacao());
        System.out.println("Diretor: " + diretor.getNome() + " receberá bonificação de R$" + diretor.getBonificacao());

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(analista);
        controle.registra(gerente);
        controle.registra(diretor);

        System.out.println("Bonificações a pagar: " + controle.getSoma());

    }

}


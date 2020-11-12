package alura.poo.introducao;
import alura.poo.introducao.Conta;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello from the server siiiiiiiide!");

        Conta conta = new Conta(10000.11, 3214, 123, "Dinky Winky");
        Conta outraConta = conta;
        outraConta.saldo += 1000;

        System.out.println(conta.titular + ": " + conta.saldo);
        System.out.println(outraConta.titular + ": " + outraConta.saldo);

    }
}

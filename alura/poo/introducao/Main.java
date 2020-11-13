package alura.poo.introducao;
import alura.poo.introducao.Conta;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello from the server siiiiiiiide!");

        Cliente dinky = new Cliente("Dinky Winky", "111.111.111-11");
        Conta conta = new Conta(10000.11, 1, 123, dinky);

        Cliente lala = new Cliente("Lala", "222.222.222,-22");
        Conta outraConta = new Conta(1000, 1, 321, lala);

        //Conta outraConta = conta;
        //outraConta.saldo += 1000;
        //System.out.println(outraConta.titular + ": " + outraConta.saldo);
        //A instância outraConta aponta para o endereço de memória de conta. Recebe os valores do objetdo de referência e também pode alterá-los

        //teste métodos
        conta.transfere(700, outraConta);
        System.out.println(conta.titular.nome + ": " + conta.getSaldo());
        System.out.println(outraConta.titular.nome + ": " + outraConta.getSaldo());

    }
}

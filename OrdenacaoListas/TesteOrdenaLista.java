package OrdenacaoListas;

import interfaces.Cliente;
import interfaces.Conta;
import interfaces.ContaCorrente;
import interfaces.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;


public class TesteOrdenaLista {

    public static void main(String[] args){
        Cliente tinkywinky = new Cliente("Tinky Winky", "111.111.111-11");
        Conta c1 = new ContaCorrente(1000, 100, 3, tinkywinky);

        Cliente dipsy = new Cliente("Dipsy", "111.222.111-11");
        Conta c2 = new ContaCorrente(1000, 100, 2, dipsy);

        Cliente lala = new Cliente("Lala", "111.222.333-11");
        Conta c3 = new ContaCorrente(1000, 100, 4, lala);

        Cliente po = new Cliente("Po", "111.222.333-44");
        Conta c4 = new ContaCorrente(1000, 100, 1, po);

        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(c1);
        listaContas.add(c2);
        listaContas.add(c3);
        listaContas.add(c4);

        ComparaNumeroConta comparaContas = new ComparaNumeroConta();
        listaContas.sort(comparaContas);

        System.out.println("Ordenação por número da conta");
        for (Conta conta: listaContas) {
           System.out.println(conta.gettitular());
        }

        ComparaNomeTitular comparaNome = new ComparaNomeTitular();
        listaContas.sort(comparaNome);

        System.out.println("Ordenação por nome do titular");
        for (Conta conta: listaContas) {
            System.out.println(conta.gettitular());
        }

        /*
        Para não criar uma classe apenas para encapsular o override de um método, existe o conceito de "classe anônima":

        listaContas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }
        });

        Mais enxuto:
        lista.sort( (Conta c1, Conta c2) -> {
            return Integer.compare(c1.getNumero(), c2.getNumero() );
        });

        Mais enxuto ainda (quando é uma só line na função):
        lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );
        */
    }


}

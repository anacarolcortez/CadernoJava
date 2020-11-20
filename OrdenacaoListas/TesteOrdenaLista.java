package OrdenacaoListas;

import herancapolimorfismo.Cliente;
import herancapolimorfismo.Conta;
import herancapolimorfismo.ContaCorrente;
import herancapolimorfismo.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;


public class TesteOrdenaLista {

    public static void main(String[] args){
        Cliente tinkywinky = new Cliente("Tinky Winky", "111.111.111-11");
        Conta c1 = new ContaCorrente(1000, 100, 1, tinkywinky);

        Cliente dipsy = new Cliente("Dipsy", "111.222.111-11");
        Conta c2 = new ContaCorrente(1000, 100, 2, dipsy);

        Cliente lala = new Cliente("Lala", "111.222.333-11");
        Conta c3 = new ContaCorrente(1000, 100, 3, lala);

        Cliente po = new Cliente("Po", "111.222.333-44");
        Conta c4 = new ContaCorrente(1000, 100, 4, po);

        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(c1);
        listaContas.add(c2);
        listaContas.add(c3);
        listaContas.add(c4);

    }


}

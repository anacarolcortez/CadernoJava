package OrdenacaoListas;

import interfaces.Conta;

import java.util.Comparator;

public class ComparaNomeTitular implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.gettitular().getNome();
        String nomeC2 = c2.gettitular().getNome();

        return nomeC1.compareTo(nomeC2);

    }
}

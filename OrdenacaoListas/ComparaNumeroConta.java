package OrdenacaoListas;

import interfaces.Conta;

import java.util.Comparator;

public class ComparaNumeroConta implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return c1.getNumero() - c2.getNumero();
    }
}

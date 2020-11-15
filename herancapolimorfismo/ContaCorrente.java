package herancapolimorfismo;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, int agencia, int numero, Cliente titular) {
        super(saldo, agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor){
        double valorSacar = valor * 1.05;
        return super.saca(valorSacar);
    }

}

package herancapolimorfismo;

public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta (double saldo, int agencia, int numero, Cliente titular){
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.total++;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean temSaldoSuficiente(double valor){
        return valor < this.saldo;
    }

    public boolean saca(double valor){
        if (temSaldoSuficiente(valor)){
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }

    public void transfere(double valor, Conta destino){
        if (saca(valor)) {
            destino.saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.print("O saldo não pode ser incializado com valor negativo");
            return;
        }
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.print("Digite um número de agência válido (maior que zero)");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.print("Digite um número de conta válido (maior que zero)");
            return;
        }
        this.numero = numero;
    }

    public Cliente get_titular() {
        return titular;
    }

    public void set_titular(Cliente _titular) {
        this.titular = _titular;
    }

    //método estático pertence à classe, e não à referência (instância)
    public static int getTotal(){
        return Conta.total;
    }


}

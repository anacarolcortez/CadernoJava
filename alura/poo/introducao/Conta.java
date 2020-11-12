package alura.poo.introducao;

public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public Conta (double saldo, int agencia, int numero, Cliente titular){
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
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

    //para o próximo passo: acesso private
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



}

package alura.poo.introducao;

public class Conta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    public Conta (double saldo, int agencia, int numero, String titular){
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

    public void saca(double valor){
        if (temSaldoSuficiente(valor)){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }




}

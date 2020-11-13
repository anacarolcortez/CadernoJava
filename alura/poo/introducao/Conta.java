package alura.poo.introducao;

public class Conta {

    private double _saldo;
    private int _agencia;
    private int _numero;
    private Cliente _titular;

    public Conta (double saldo, int agencia, int numero, Cliente titular){
        this._saldo = saldo;
        this._agencia = agencia;
        this._numero = numero;
        this._titular = titular;
    }

    public void deposita(double valor){
        this._saldo += valor;
    }

    public boolean temSaldoSuficiente(double valor){
        return valor < this._saldo;
    }

    public boolean saca(double valor){
        if (temSaldoSuficiente(valor)){
            this._saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }

    public void transfere(double valor, Conta destino){
        if (saca(valor)) {
            destino._saldo += valor;
        }
    }

    public double getSaldo() {
        return _saldo;
    }

    public void setSaldo(double saldo) {
        this._saldo = saldo;
    }

    public int getAgencia() {
        return _agencia;
    }

    public void setAgencia(int agencia) {
        this._agencia = agencia;
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int numero) {
        this._numero = numero;
    }

    public Cliente get_titular() {
        return _titular;
    }

    public void set_titular(Cliente _titular) {
        this._titular = _titular;
    }


}

package alura.poo.introducao;

public class Cliente {

    private String _nome;
    private String _cpf;

    public Cliente(String nome, String cpf){
        this._nome = nome;
        this._cpf = cpf;
    }

    //para o próximo passo: encapsulamento
    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getCpf() {
        return _cpf;
    }

    public void setCpf(String cpf) {
        this._cpf = cpf;
    }
}

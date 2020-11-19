package colecoes;

public class Aluno {
    String nome;
    int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString(){
        return "[Aluno: " + this.nome + "]";
    }

}

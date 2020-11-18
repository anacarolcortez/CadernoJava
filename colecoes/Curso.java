package colecoes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
        //evita que se altere a lista fora dos métodos da classe destinados a tal objetivo
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adicionaAula(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
       /*
        int somaTempo = 0;
        for (Aula aula: aulas) {
            somaTempo += aula.getTempo();
        }
        return somaTempo;
        */
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString(){
        return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ". Aulas: " + this.aulas + "]";
    }

}

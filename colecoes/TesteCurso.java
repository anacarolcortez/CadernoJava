package colecoes;

import java.util.List;

public class TesteCurso {

    public static void main(String[] args){
        Curso java = new Curso("Formação Java", "Paulo Silveira");

        java.adicionaAula(new Aula("Trabalhando com ArrayList", 20));
        java.adicionaAula(new Aula("Aprofundando Collections", 15));
        java.adicionaAula(new Aula("Streams Java 8", 18));

        System.out.println(java.getAulas());
        System.out.println(java.getTempoTotal());
    }
}

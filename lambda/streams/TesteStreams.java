package lambda.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteStreams {

    public static void main(String[] args){
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Java", 1500));
        cursos.add(new Curso("Python", 1400));
        cursos.add(new Curso("C#", 1200));
        cursos.add(new Curso("Javascript", 2000));
        cursos.add(new Curso("Ruby", 900));
        cursos.add(new Curso("C++", 1000));

        //Funcoes Lambda (com 2 sintaxes diferentes)
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        //cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach(curso -> System.out.println(curso + ";"));
        //cursos.forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() > 1000)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        int sum = cursos.stream()
                .filter(c -> c.getAlunos() < 1000)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println("Total:" + sum);
    }
}

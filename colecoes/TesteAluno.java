package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

    public static void main(String[] args){
        Set<String> alunos = new HashSet<>();
        //não aceita repetição, porém, a ordem de gravação dos registros é variada

        alunos.add("Tinky Winky");
        alunos.add("Dipsy");
        alunos.add("Lala");
        alunos.add("Po");

        alunos.forEach(aluno -> System.out.println(aluno));

        boolean isPoMatriculado = alunos.contains("Po");
        System.out.println(isPoMatriculado);

        //Collections.sort não funciona para Set, somente para List.
        //List<String> alunosEmLista = new ArrayList<>(alunos); => cria uma lista do set alunos, assim poderia usar sort
    }
}

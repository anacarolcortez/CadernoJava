package colecoes;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipaisMetodosListas {

    public static void main (String[] args) {
        String aula1 = "Conhecendo Coleções em Java: Sets e Listas";
        String aula2 = "TDD - Test Driven Development";
        String aula3 = "Tratamento de Exceções";


        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        aulas.remove(1);
        aulas.add(aula2);

        System.out.println(aulas);
        System.out.println("Lista de tamanho: " + aulas.size());

        //palavra-chave foreach
        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        aulas.forEach(aula -> System.out.println(aula));

        Collections.sort(aulas);
        System.out.println(aulas);

    }

}

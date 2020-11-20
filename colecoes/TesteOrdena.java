package colecoes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteOrdena {
    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Girafales", 42);
        Funcionario f2 = new Funcionario("Tiburcio", 33);
        Funcionario f3 = new Funcionario("Xavier", 51);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        }


    }
}

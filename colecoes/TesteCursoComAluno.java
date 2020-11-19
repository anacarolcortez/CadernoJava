package colecoes;

public class TesteCursoComAluno {

    public static void main(String[] args){

        Curso java = new Curso("Java 8", "Prof Girafales");

        java.adicionaAula(new Aula("Trabalhando com ArrayList", 20));
        java.adicionaAula(new Aula("Aprofundando Collections", 15));
        java.adicionaAula(new Aula("Streams Java 8", 18));

        Aluno aluno1 = new Aluno("Tinky Winky", 102);
        Aluno aluno2 = new Aluno("Dipsy", 103);
        Aluno aluno3 = new Aluno("Lala", 104);
        Aluno aluno4 = new Aluno("Po", 104);

        java.matriculaAluno(aluno1);
        java.matriculaAluno(aluno2);
        java.matriculaAluno(aluno3);
        java.matriculaAluno(aluno4);

        System.out.println(java.getAlunos());

    }
}

package colecoes;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matriculaDoAluno = new HashMap<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
        //unmodifiable evita que se altere a lista fora dos métodos da classe destinados a tal objetivo
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void adicionaAula(Aula aula){
        this.aulas.add(aula);
    }

    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaDoAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }


    public Aluno buscaMatriculado(int matricula) {
        if (!matriculaDoAluno.containsKey(matricula)){
            throw new NoSuchElementException("Aluno não encontrado");
        }
        return matriculaDoAluno.get(matricula);

        /*for (Aluno aluno : alunos){
            if (aluno.getNumeroMatricula() == matricula){
                return aluno;
            }
        }
        throw new NoSuchElementException("Aluno não encontrado");*/
    }

    @Override
    public String toString(){
        return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ". Aulas: " + this.aulas + "]";
    }

}

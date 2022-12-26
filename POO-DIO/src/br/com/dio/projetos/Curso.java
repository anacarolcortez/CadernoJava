package src.br.com.dio.projetos;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso (String titulo, String descricao, int cargaHoraria){
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso => titulo: " + super.getTitulo() + ", descrição: " + super.getDescricao() + ", carga horária: " + cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return (double)(XP_PADRAO * cargaHoraria);
    }

    
}

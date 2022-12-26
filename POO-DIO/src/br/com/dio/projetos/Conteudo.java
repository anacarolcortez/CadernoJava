package src.br.com.dio.projetos;

public abstract class Conteudo {
   
    protected final static double XP_PADRAO = 10.0;
        
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
   
}

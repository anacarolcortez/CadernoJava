package src.br.com.dio.projetos;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate date;

    public Mentoria(String titulo, String descricao, LocalDate date) {
        super(titulo, descricao);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoria => titulo: " + super.getTitulo() + ", descrição: " + super.getDescricao() + ", date: " + date;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20.0;
    }

    
}

package tabuleiro;

public class PosicaoTabuleiro {
    private int linha;
    private int coluna;

    public PosicaoTabuleiro(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void setValues(int linha, int coluna){
        this.setLinha(linha);
        this.setColuna(coluna);
    }

    @Override
    public String toString(){
        return linha + ", " + coluna;
    }
}

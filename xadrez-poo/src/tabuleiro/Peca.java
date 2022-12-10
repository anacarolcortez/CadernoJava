package tabuleiro;

public class Peca {

    private PosicaoTabuleiro posicaoTabuleiro;

    private Tabuleiro tabuleiro;


    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.posicaoTabuleiro = null;
    }

    protected Tabuleiro getTabuleiro(){
        return this.tabuleiro;
    }

    public PosicaoTabuleiro getPosicao() {
        return posicaoTabuleiro;
    }

    public void setPosicao(PosicaoTabuleiro posicaoTabuleiro) {
        this.posicaoTabuleiro = posicaoTabuleiro;
    }

}

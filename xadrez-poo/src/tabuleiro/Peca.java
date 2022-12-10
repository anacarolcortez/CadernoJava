package tabuleiro;

public abstract class Peca {

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

    public abstract char exibePeca();

    public abstract boolean[][] movimentosPossiveis();

    public boolean movimentoPossivel(PosicaoTabuleiro posicao){
        return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
    }

    public boolean existeMovimentoPossivel(){
        boolean matriz[][] = movimentosPossiveis();
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                if (matriz[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}

package xadrez;

import tabuleiro.Peca;
import tabuleiro.PosicaoTabuleiro;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        setUpInicial();
    }

    public PecaXadrez[][] getPecasPartida(){
        PecaXadrez[][] pecasPartida = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i=0; i<tabuleiro.getLinhas(); i++){
            for (int j=0; j< tabuleiro.getColunas(); j++){
                pecasPartida[i][j] = (PecaXadrez) tabuleiro.getPeca(i,j);
            }
        }
        return pecasPartida;
    }

    private void moverPecaNoTabuleiro(char coluna, int linha, PecaXadrez pecaXadrez){
        tabuleiro.movePeca(pecaXadrez, new PosicaoXadrez(coluna, linha).converterMatriz());
    }

    private void setUpInicial(){
        //Peças pretas na parte de cima do tabuleiro
        moverPecaNoTabuleiro('a', 8, new Torre(this.tabuleiro, Cor.PRETO));
        moverPecaNoTabuleiro('e', 8, new Rei(this.tabuleiro, Cor.PRETO));

        //Peças brancas na parte de baixo do tabuleiro
        moverPecaNoTabuleiro('a', 1, new Torre(this.tabuleiro, Cor.BRANCO));
        moverPecaNoTabuleiro('e', 1, new Rei(this.tabuleiro, Cor.BRANCO));
    }
}

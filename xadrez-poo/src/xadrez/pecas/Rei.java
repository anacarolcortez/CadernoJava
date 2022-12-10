package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public char exibePeca(){
        if (this.getCor() == Cor.PRETO){
            return '\u2654';
        } else {
            return '\u265A';
        }
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean matriz[][] = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        return matriz;
    }
}

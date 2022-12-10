package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public char exibePeca(){
        if (this.getCor() == Cor.PRETO){
            return '\u2656';
        } else {
            return '\u265C';
        }
    }
}

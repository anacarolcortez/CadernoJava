package xadrez.pecas;

import tabuleiro.PosicaoTabuleiro;
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

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean matriz[][] = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];

        PosicaoTabuleiro p = new PosicaoTabuleiro(0,0);

        //para Cima
        p.setValues(this.getPosicao().getLinha()-1, this.getPosicao().getColuna());
        while(this.getTabuleiro().posicaoExiste(p) && !this.getTabuleiro().existePecaNaPosicao(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha()-1);
        }
        if (this.getTabuleiro().posicaoExiste(p) && existePecaAdversaria(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
        }

        //para Esquerda
        p.setValues(this.getPosicao().getLinha(), this.getPosicao().getColuna()-1);
        while(this.getTabuleiro().posicaoExiste(p) && !this.getTabuleiro().existePecaNaPosicao(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna()-1);
        }
        if (this.getTabuleiro().posicaoExiste(p) && existePecaAdversaria(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
        }

        //para Direita
        p.setValues(this.getPosicao().getLinha(), this.getPosicao().getColuna()+1);
        while(this.getTabuleiro().posicaoExiste(p) && !this.getTabuleiro().existePecaNaPosicao(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna()+1);
        }
        if (this.getTabuleiro().posicaoExiste(p) && existePecaAdversaria(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
        }

        //para Baixo
        p.setValues(this.getPosicao().getLinha()+1, this.getPosicao().getColuna());
        while(this.getTabuleiro().posicaoExiste(p) && !this.getTabuleiro().existePecaNaPosicao(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha()+1);
        }
        if (this.getTabuleiro().posicaoExiste(p) && existePecaAdversaria(p)){
            matriz[p.getLinha()][p.getColuna()] = true;
        }

        return matriz;
    }
}

package xadrez;

import tabuleiro.PosicaoTabuleiro;

public class PosicaoXadrez {
    private char coluna;
    private int linha;


    public PosicaoXadrez(char coluna, int linha) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new ErroXadrez("Posição inválida");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    protected PosicaoTabuleiro converterMatriz(){
        return new PosicaoTabuleiro(8-linha, coluna-'a');
    }

    protected static PosicaoXadrez receberCoordenada(PosicaoTabuleiro posicao){
        return new PosicaoXadrez((char)('a'- posicao.getColuna()), posicao.getLinha()-8);
    }

    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}

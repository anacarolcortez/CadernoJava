package xadrez;

import tabuleiro.Tabuleiro;

public class Partida {
    private Tabuleiro tabuleiro;

    public Partida(){
        tabuleiro = new Tabuleiro(8,8);
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
}

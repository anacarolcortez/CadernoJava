package aplicacao;

import tabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class Programa {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(8,8);
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.exibeTabuleiro(partidaXadrez.getPecasPartida());
    }
}
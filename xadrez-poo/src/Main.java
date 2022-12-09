import tabuleiro.Tabuleiro;
import xadrez.Partida;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(8,8);
        Partida partida = new Partida();
        UI.exibeTabuleiro(partida.getPecasPartida());
    }
}
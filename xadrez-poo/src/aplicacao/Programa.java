package aplicacao;

import tabuleiro.ErroTabuleiro;
import tabuleiro.Tabuleiro;
import xadrez.ErroXadrez;
import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(8,8);
        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while (true){
            try {
                UI.limparConsole();
                UI.exibeTabuleiro(partidaXadrez.getPecasPartida());
                System.out.println();
                System.out.print("Origem: ");
                PosicaoXadrez origem = UI.receberPosicaoPeca(sc);

                System.out.println();
                System.out.print("Destino: ");
                PosicaoXadrez destino = UI.receberPosicaoPeca(sc);

                PecaXadrez pecaXadrez = partidaXadrez.performarMovePeca(origem, destino);
            } catch (ErroXadrez ex){
                System.out.println(ex.getMessage());
                sc.nextLine();
            } catch (ErroTabuleiro et){
                System.out.println(et.getMessage());
                sc.nextLine();
            }
        }
    }
}
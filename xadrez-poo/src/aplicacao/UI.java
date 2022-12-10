package aplicacao;

import xadrez.ErroXadrez;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;

import javax.transaction.xa.XAException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    public static void exibeTabuleiro(PecaXadrez[][] pecasPartida) {
        for (int i=0; i< pecasPartida.length; i++){
            System.out.print((8-i) + " ");
            for (int j=0; j<pecasPartida.length; j++){
                exibePeca(pecasPartida[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void exibePeca(PecaXadrez peca){
        if (peca == null){
            System.out.print("-");
        } else {
            System.out.print(peca.exibePeca());
        }
        System.out.print(" ");
    }

    public static PosicaoXadrez receberPosicaoPeca(Scanner sc){
        try {
            String s = sc.nextLine();
            char coluna = s.charAt(0);
            int linha = Integer.parseInt(s.substring(1));
            return new PosicaoXadrez(coluna, linha);
        } catch (RuntimeException e){
            throw new ErroXadrez("Dados inválidos. Informe posição de a1 até h8");
        }
    }

    public final static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

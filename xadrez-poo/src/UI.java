import xadrez.PecaXadrez;

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
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}

package tabuleiro;

public class ErroTabuleiro extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ErroTabuleiro(String msg){
        super(msg);
    }

}

package xadrez;

public class ErroXadrez extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ErroXadrez(String msg){
        super(msg);
    }

}

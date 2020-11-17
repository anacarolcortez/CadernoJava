package trycatchcontasbytebank;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch(MinhaExcecao ex) {
            System.out.println("Texto do método com tratamento");
        }

    }

}

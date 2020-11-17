package pilhaexcecoes;

public class Fluxo {

    public static void main(String[] args){
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1(){
        System.out.println("Início do método 1");
        metodo2(10, 2);
        metodo2(10, 0);
        System.out.println("Fim do método 1");
    }

    private static void metodo2( int num1, int num2){
        System.out.println("Início do método 2");
        try {
            int resultado = num1/num2;
        } catch (ArithmeticException erro){
            System.out.println("Erro: " + erro);
        } finally {
            System.out.println("Método 2 foi executado");
        }
        System.out.println("Fim do método 2");
    }
}

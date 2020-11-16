package interfaces;

public class Teste {
    public static void main(String[] args){

        Cliente cliente = new Cliente("Katiana", "111.222.333-44");
        ContaCorrente cc = new ContaCorrente(1000.50, 123,565656, cliente);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraImposto imposto = new CalculadoraImposto();
        imposto.registra(cc);
        imposto.registra(seguro);

        System.out.println("Total de imposto: $" + imposto.getTotalImposto());
    }
}

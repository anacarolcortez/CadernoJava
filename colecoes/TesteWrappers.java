package colecoes;

public class TesteWrappers {
    //Classe mãe: Number
    //abaixo, classes filhas: Double, Long, Integer, Float, Short, Byte

    public static void main(String[] args){
        Integer idadeRef = Integer.valueOf(35); //autoboxing;
        System.out.println(idadeRef.doubleValue()); //unboxing;

        Double dRef = Double.valueOf(3.5);
        System.out.println(dRef);

        Number fRef = Float.valueOf(3.5f);
        System.out.println(fRef);

    }
}

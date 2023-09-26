package edu.marcos.primeirasemana.operadores;

public class OperadoresUnariosTorF {
    public static void main(String[] args){
        boolean variavel = true;
        System.out.println(!variavel); //lembrese que em memoria a variavel continua sendo true
                                        // pois a ela não foi atriuido o valor false
        System.out.println(variavel);
        variavel = !variavel; //esta é a forma adequada de converter um valor boleano dentro de uma variavel
        System.out.println(variavel);
    }
}

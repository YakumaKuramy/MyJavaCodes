package edu.marcos.primeirasemana.operadores;

public class OperadoresUnarios {
    public static void main(String [] args){
        int numero = 5; //numero positivo
        System.out.println(numero); 
        numero = -numero; //o metodo acima é usado para converter um numero positivo em negativo
        System.out.println(numero);
        //numero = + numero; //o mesmo não vale para tornar um numero negativo em positivo, 
                            //pois o "+" funcionara como adição, loog é preciso multiplicar 
                            // a variavel por -1
        numero = numero * -1;
        System.out.println(numero);
    }
    
}

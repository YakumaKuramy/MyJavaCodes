package edu.marcos.primeirasemana.operadores;

public class OperadoresAritmeticos {
    public static void main(String [] args){
        double soma = 10.5 + 15.7; //uso do operador aritmetico para somar 2 numeros reais
        System.out.println(soma);
        int subtracao = 113 - 25; //uso do operador de subtração para inteiros
        System.out.println(subtracao);
        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);
        int divisao = 15 / 3;
        System.out.println(divisao);
        int modulo = 18 % 3; // uso do operador de modulo para buscar o resto da divisão 
        System.out.println(modulo);
        double resultado = (10 * 7) + (20/4); //uso conjunto de operadores aritmeticos usando ordem de precedencia na resolução
        System.out.println(resultado);

        //O operador de adição "+" realizara a concatenação quando for operação entre Strings
        // segue exemplo
        String nomeCompleto = "Marcos " + "Sousa";
        System.out.println(nomeCompleto); 

        //Quando temos o uso do operador de somar com no uso de numeros e textos, 
        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
    //Uso de operdadores aritmeticos 
    
}

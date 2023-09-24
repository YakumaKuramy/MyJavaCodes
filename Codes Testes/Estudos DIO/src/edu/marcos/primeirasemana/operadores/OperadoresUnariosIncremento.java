package edu.marcos.primeirasemana.operadores;

public class OperadoresUnariosIncremento {
    public static void main(String[] args){
        int numero = 5;
        //numero = numero + 3; //para fazer o incremento de valores a variaveis, precisamos atribuir
                            //ao valor atual o proximo valor
        System.out.printf("1ª impressão: %s, valor inicial inalterado \n",numero); //aqui o valor inicial ainda é 5
        numero++; // quando precisamos usar ese incremento com o valor de 1, podemos // aqui passamos o valor a 6 com incremento
                //simplificar usando o "++", sem a necessidade de usar "numero = numero"
        //uma outra forma de incrementar é dentro do print, mas se atente aos detalhes de ordem
        System.out.printf("2ª impressão: %s, apos o incremento usando o metodo '++' fora do printf \n" ,numero);
        System.out.printf("3ª impressão: %s, usando o incremento dentro do printf \n",++numero); //passamos o valor a 7 com incremento de forma diferente
        System.out.println(numero); //imprimimos o valor para saber se ele foi verdadeiramente atribuido a variavel
        //O que foi testado foi usando incremento, contudo o mesmo vale para decremento
        System.out.println(numero --); // perceba que a principal diferença entre os 2 metodos é que 
        // o vaor do decremento não é atriuido a variavel quando ele é feito posterior ao comando
        System.out.println(numero);
    }
}

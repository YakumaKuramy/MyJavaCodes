package edu.marcos.primeirasemana.operadores;

public class OperadoresLogicos {
    public static void main(String[] args){
        // Operadores.java
        boolean condicao1 = true;
        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         Perceba que podemos usar comparações matematica, desde que tenham resultado
         boleano
         */

        if(condicao1 && (7 > 4)) {
            System.out.println("Os dois valores precisam ser verdadeiros");
        }
        if(condicao1 && condicao2){
            System.out.println("Os dois valores precisam ser verdadeiros");
        }
        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2){
            System.out.println("Um dos valores precisa ser verdadeiro");
        }
        System.out.println("FIM");
    }
}

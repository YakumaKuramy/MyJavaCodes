package edu.marcos.primeirasemana.tipos_operadores;

public class OperadorTernario {
    public static void main(String [] args){
        int valor_a, valor_b;
        valor_a = 5;
        valor_b = 6;
        String resultado = "";
        //Estrutura padrão
        if(valor_a==valor_b){
            resultado = "Verdadeiro";
            System.out.println(resultado);
        }
        else{
            resultado = "Falso";
            System.out.println(resultado);
        }
        
        //Estrutura com uso do operador ternario
        //Faça o maximo possivel para lembrar da estrutura pois ela é primordial
        String result = valor_a==valor_b ? "True" : "False";
        System.out.println(result);
        
        // o mesmo pode ser udsado para inteiros
        int res_int = valor_a == valor_b ? 1 : 0;
        System.out.println(res_int);


    }
}

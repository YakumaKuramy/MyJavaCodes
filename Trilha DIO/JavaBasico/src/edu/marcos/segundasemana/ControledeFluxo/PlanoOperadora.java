package edu.marcos.segundasemana.ControledeFluxo;

import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Informe o plano desejado: ");
        String plano = scanner.next();

        switch (plano) {
            /*O uso de break no switch case é apenas para o caso de você não querer
             *que o codigo abaixo seja executado */
            case "U":{
                System.out.println("5Gb Youtube ");
            }
            case "M":{
                System.out.println("Whats e Intagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

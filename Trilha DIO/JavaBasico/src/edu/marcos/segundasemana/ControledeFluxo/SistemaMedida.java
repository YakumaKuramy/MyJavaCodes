package edu.marcos.segundasemana.ControledeFluxo;

import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sigla = scanner.next();
/*
        if (sigla == "P") {
            System.out.println("Pequeno");
        }
        else if (sigla == "M") {
            System.out.println("Medio");
        }
        else if (sigla == "G") {
            System.out.println("Grande");
        }
        else {
            System.out.println("Indefinido");
        }
 */        
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}

package edu.marcos.segundasemana.ControledeFluxo;

import java.util.Scanner;

public class ControleFluxoEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Informe a nota: ");
        int nota = scanner.nextInt();
        
        if (nota >= 7) {
            System.out.println("Aluno Aprovado");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Pode fazer AF");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
}

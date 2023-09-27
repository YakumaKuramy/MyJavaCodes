package edu.marcos.segundasemana.ControledeFluxo;

import java.util.Scanner;

public class ResultadorEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota: ");
        int nota = scanner.nextInt();
        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }

    }
}

package edu.marcos.segundasemana.ControledeFluxo;

import java.util.Scanner;

public class CodicaoTernaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a nota: ");
        int nota = scanner.nextInt();

        //String resultado = nota >= 7 ? "Aluno Aprovado" : "Aluno Reprovador";
        String resultado = nota >= 7 ? "Aluno Aprovado" : nota >= 5 && nota < 7 ? "Pode fazer AF" : "Aluno Reprovador";
        System.out.println(resultado);
    }
}
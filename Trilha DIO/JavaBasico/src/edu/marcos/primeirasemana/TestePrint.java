package edu.marcos.primeirasemana;

import java.util.Scanner;

public class TestePrint {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        String mensagem = "Olá, Mundo! "; 
        System.out.println(mensagem);
        System.out.print("Escreva seu texto: ");
        mensagem = ler.nextLine();
        System.out.printf("Seu texto aqui: %s \n",mensagem);
    }
}
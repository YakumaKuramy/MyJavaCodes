package edu.marcos.primeirasemana;

import java.util.Scanner;

public class TestePrint {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        String mensagem = "Olá, Mundo! ";
        System.out.println(mensagem);
        mensagem = ler.nextLine();
        System.out.println(mensagem);
    }
}
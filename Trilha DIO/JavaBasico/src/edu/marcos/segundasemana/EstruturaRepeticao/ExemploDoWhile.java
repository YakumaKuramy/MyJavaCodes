package edu.marcos.segundasemana.EstruturaRepeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Dicando...");
        do {
            System.out.println("Telefone tocando");
        }
        while (tocando());
            System.out.println("Alô !!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.printf("Atendeu? %b \n", atendeu);
        return ! atendeu;
    }
    
}

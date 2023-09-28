package edu.marcos.segundasemana.EstruturaRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.printf("Doce do valor %.2f adicionado ao carrinho \n", valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.printf("Mesada %.2f \n", mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}

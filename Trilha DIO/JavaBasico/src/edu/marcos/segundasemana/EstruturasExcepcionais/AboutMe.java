package edu.marcos.segundasemana.EstruturasExcepcionais;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.printf("Olá, me chamo %s %s \n", nome, sobrenome);
        System.out.printf("Tenho %d \n", idade);
        System.out.printf("Minha altura é: %.2f cm \n", altura);
    }
}

package edu.marcos.segundasemana.ControledeFluxo;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 25.0;
        System.out.printf("Seu saldo atual é: %.2f \n" , saldo);
        System.out.print("Informe o valor do saque: ");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.printf(
                "Saque concluido com sucesso. Você sacou o valor de %.2f. \nSeu saldo atual é de: %.2f \n",
                valorSolicitado, saldo);
        }
        else{
            System.out.printf("Saldo insuficiente! Seu saldo: %.2f \n", saldo);
        }
    }
}

package edu.marcos.primeirasemana.operadores;

import javax.xml.crypto.Data;

public class OperadoresAtribuicao {
    public static void main(String [] args) {
        //Operadores Relacionais 
        String nome = "Marcos"; //Para a atribuição de strings, usamos as aspas duplas 
        int idade = 26; //Para inteiros, usamos o numero direto sem pontos ou virgulas
        double peso = 81.0; //Para reais, usamos o ponto para separar as casas decimais
        char sexo = 'M'; // Para caracter unico, usamos as aspas simples
        boolean doadorOrgao = false; // Variaiveis do tipo boolean só recebem verdadeiro ou falso
        Data dataNascimento = new Data() { // Aqui temos a criação de uma classe simples

        };
        System.out.printf("Seu nome: %s , sua idade é: %d, você pesa aproximadamente %2f \n você é do sexo %c, você é doador de orgãos: %b \n", nome, idade, peso, sexo, doadorOrgao);
        // Em todos os casos ha atribuição, mas para cada uma delas a uma regra especifica a ser seguida
    }
    
}

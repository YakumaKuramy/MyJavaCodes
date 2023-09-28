package edu.marcos.segundasemana.EstruturaRepeticao;

public class ExemploForArray {
    public static void main(String[] args) { 
        String alunos [] = {"Marcos", "Paulo", "Thiago", "Luiza"};
        for ( int indice = 0 ; indice < alunos.length ; indice++ ) {
            System.out.printf("O aluno no indice x = %d é %s \n", indice, alunos[indice]);
        }
    }
}

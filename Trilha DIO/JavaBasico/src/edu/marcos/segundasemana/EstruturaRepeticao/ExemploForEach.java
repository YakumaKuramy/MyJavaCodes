package edu.marcos.segundasemana.EstruturaRepeticao;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos [] = {"Marcos", "Paulo", "Maria", "Luiza"};
        for (String aluno : alunos) {
            System.out.printf("Nome do aluno é: %s \n", aluno);
        }
    }
}

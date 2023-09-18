package edu.marcos.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("Aluno Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova de Minerva");
        else
            System.out.println("Aluno Aprovado");

    }
}

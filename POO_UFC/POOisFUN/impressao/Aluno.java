package POO_UFC.POOisFUN.impressao;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a disciplina: ");
        String disciplina = scanner.nextLine();
        System.out.print("Informe a matricula do aluno: ");
        int matricula = scanner.nextInt();
        System.out.print("Informe a nota do aluno: ");
        double nota = scanner.nextDouble();
    }
}

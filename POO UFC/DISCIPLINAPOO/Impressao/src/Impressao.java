import java.util.Scanner;
    //Sempre que declaramos um variavel como static ela se torna 
    //como uma variavel global e não independente para cada objeto 

class Aluno {
    String nome;
    int matr;
    String disc;
    float nota;
   
    void imprimir () {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matr);
        System.out.println("Disciplina: " + disc);
        System.out.println("Nota: " + nota);
    }

    void ler () {
        Scanner in = new Scanner(System.in);
        
        nome = in.nextLine();
        matr = Integer.parseInt( in.nextLine() );
        disc = in.nextLine();
        nota = Float.parseFloat( in.nextLine() );
    }
}


public class  Impressao {
    public static void main(String[] arg){
        Aluno a1 = new Aluno();
        a1.ler();
        a1.imprimir();
    }
    
}

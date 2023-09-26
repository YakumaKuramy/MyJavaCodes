package edu.marcos.primeirasemana.operadores;

public class MetodoEquals {
    public static void main(String[] args){
        String nomeUm = "Marcos";
        String nomeDois = new String("Marcos");
        //Usado quando preciso comparar objetos
        System.out.println(nomeUm.equals(nomeDois));
    }
}

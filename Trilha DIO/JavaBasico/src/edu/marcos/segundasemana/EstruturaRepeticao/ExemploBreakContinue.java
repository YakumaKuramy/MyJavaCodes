package edu.marcos.segundasemana.EstruturaRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1 ; numero <= 5 ; numero++) {
            //para o uso do break, ele para a aplicação onde a comparação pedir
            /* 
            if (numero == 3) {
                break;
            }
            */
            //já o continue pula para a proxima ação de acordo com a condição pedida
            if (numero == 3) {
                continue;
            }

            System.out.println(numero);
        }
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*TODO
        Criação do objeto scanner
        Pedir informações ao usuario com print definindo qual informação esta sendo pedida 
        Imprimir uma mensagem final 
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Por favor, informe o numero da agencia: ");
        String agencia = scanner.next();
        System.out.print("Por favor, informe seu nome: ");
        String nomeCliente = scanner.next();
        Double saldo = 120.40;

        System.out.printf(
            "Ola, %s, obrigado por criar uma conta em nosso banco, \nsua agencia é %s, conta %d, e seu saldo %.2f \njá esta disponivel para saque\n",
            nomeCliente, agencia, numero, saldo
            );

    }
}

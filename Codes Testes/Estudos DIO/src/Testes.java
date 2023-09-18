public class Testes {
    public static void main(String[] args) {
        String meuNome = "Marcos";
        int anoNascimento = 1997;
        boolean homem = true;

        System.out.println(anoNascimento);
        String primeiroNome = "Marcos";
        String segundoNome = "Sousa";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

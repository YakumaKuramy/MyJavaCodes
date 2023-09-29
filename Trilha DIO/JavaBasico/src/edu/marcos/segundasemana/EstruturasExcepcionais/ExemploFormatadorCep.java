package edu.marcos.segundasemana.EstruturasExcepcionais;

public class ExemploFormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP informado não esta formatado devidamente");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) 
            throw new CepInvalidException();
            return "12.345-678";
    }
}

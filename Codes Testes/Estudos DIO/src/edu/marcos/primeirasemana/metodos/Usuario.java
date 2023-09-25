package edu.marcos.primeirasemana.metodos;
public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.diminuirVolume();
        System.out.println("Diminuindo volume para: " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}

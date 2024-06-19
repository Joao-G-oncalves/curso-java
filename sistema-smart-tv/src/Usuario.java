public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

       smartTv.ligar();

       System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       smartTv.diminuirVolume();
       smartTv.mudarCanal(45);
       System.out.println("Volume Atual: " + smartTv.volume);


    }
}

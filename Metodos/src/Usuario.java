public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("TV em qual canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
    

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("TV em qual canal: " + smartTv.canal);
        System.out.println("TV em qual volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo ----> TV está ligada? " + smartTv.ligada);
    }
}

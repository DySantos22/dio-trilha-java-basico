public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA : " + smartTv.ligada);
        System.out.println("CANAL ATUAL: "+smartTv.canal);
        System.out.println("VOLUME ATUAL: "+smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.mudarCanal(50);

        System.out.println("CANAL ATUAL: "+ smartTv.canal);


    }
}

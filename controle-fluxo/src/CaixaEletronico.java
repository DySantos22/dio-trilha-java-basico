public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorsolicitado = 30.0;

        if (valorsolicitado < saldo){
            saldo = saldo - valorsolicitado;

            System.out.println("Saldo restante: "+saldo);
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
}

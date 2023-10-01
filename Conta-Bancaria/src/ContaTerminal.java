    import java.util.Scanner;
    import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Instanciando a função Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Número da Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o valor de seu depósito: ");
        Double saldo = scanner.nextDouble();

        System.out.println("------------------------------------------");

        System.out.println("Olá "+nome+" "+sobrenome+" obrigado por criar sua conta em nosso banco, sua agência é "+agencia+" conta "+numero+ " e seu saldo de R$"+saldo+" já está disponível para saque!");

    }
}

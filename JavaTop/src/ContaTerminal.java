import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Primeiro Nome, por favor:");
        String nome = scanner.next();
        
        System.out.println("Digite sua Agência, por favor:");
        String agencia = scanner.next();

        System.out.println("Digite seu Número, por favor");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu Saldo, por favor:");
        double saldo = scanner.nextDouble();
        
        scanner.close();

         //imprimindo os dados obtidos pelo usuario
        System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
      
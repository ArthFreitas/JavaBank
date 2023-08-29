import java.util.Locale;
import java.util.Scanner;

//Para digitar no Terminal, insira "console": "integratedTerminal" nas configurações.


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Bem Vindo ao Banco!!\nDigite seu Primeiro Nome, por favor:"); // Use o \n para pular uma linha!!
        String nome = scanner.next(); //valor STRING

        System.out.println("Digite sua Agência, por favor:");
        String agencia = scanner.next(); //valor STRING

        System.out.println("Digite seu Número, por favor");
        int numero = scanner.nextInt(); //valor INT
        
        System.out.println("Digite seu Saldo, por favor:");
        double saldo = scanner.nextDouble(); //valor DOUBLE
        
         //imprimindo os dados obtidos pelo usuario
        System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!!");
        scanner.close(); //Fecha o Scanner, caso contrário, se não estivesse fechado, o código não funcionaria
    }
}
      
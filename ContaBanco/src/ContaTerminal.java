import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //criar o Objeto Scanner 

        Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);
    
        System.out.println("Por favor, digite o numero da Sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite a Agência: ");
        String agencia =scanner.next();

        System.out.println("Por Favor, digite Seu Nome: ");
        String nome =scanner.next();

        System.out.println("Por favor,digite o saldo: ");
        double saldo =scanner.nextDouble();

       

        //imprimir os Valores coletados pelo Scanner
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia+ ", conta " + conta+ 
         " e seu saldo: " +saldo+
          " já esta disponivel para saque.");
        
    }
}

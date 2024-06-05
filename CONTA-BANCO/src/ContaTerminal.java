import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Bem-vindo ao Sistema Bancario - Banco Digital Apex ");

      System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.next();
      
      System.out.println("Digite a senha do titular da conta: ");
        int senhaTitular = scanner.nextInt();

      System.out.println("Digite saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

      System.out.println("Conta criada com sucesso!!");
      System.out.println("Dados da conta é : " + " Usuario: "+ nomeTitular + "  " + " Senha: " +  senhaTitular);
      System.out.println("E o saldo da sua conta esta em: R$ " + saldoInicial );
      System.out.println("Obrigado por usar nosso sistema BDA (Banco Digital Apex)");

      
      
    
    }
}

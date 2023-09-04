import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        // Solicitar que o usuario insira o numero da agencia

        System.out.println("Por favor, insira o número da Agência: ");

        String agencia = scanner.nextLine();

        // Solicitar que o usuario insira o numero da conta

        System.out.println("Por favor, digite o número da Conta: ");

        int numero = scanner.nextInt();
        scanner.nextLine(); // limpar a entrada

        // Solicitar que o usuario insira o nome (cliente)

        System.out.println("Por favor, o nome do Cliente: ");

        String nomeCliente = scanner.nextLine();

        // Solicitar ao usuario que digite o saldo

        System.out.println("Por favor, digite o Saldo: ");

        double saldo = scanner.nextDouble();

        // fechando o scanner apos a leitura dos dados

        scanner.close();

        // Exibir a mensagem final

        System.out.printf("Olá %s, obrigado por criar uma conta com o nosso Banco, sua agência é %s, conta %d, e o seu saldo é %.2f já esta disponivel para saque .%n", nomeCliente, agencia, numero, saldo);

    }
    }



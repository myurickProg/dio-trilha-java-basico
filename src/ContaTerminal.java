import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o saldo do cliente: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá! " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " Já está disponível para saque");
        }
    }

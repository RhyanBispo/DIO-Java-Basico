import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.print("Por favor, digite seu nome: ");
        conta.nome = scanner.next();
        
        System.out.print("\nPor favor, digite o número da Agência: ");
        conta.agencia = scanner.next();

        System.out.print("\nPor favor, digite o número da conta: ");
        conta.numero = scanner.nextInt();

        System.out.print("\nPor favor, digite o saldo da conta:");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá" + conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é" + conta.agencia + ", conta" + conta.numero + " e seu saldo" + conta.saldo + "já está disponível para saque.");

        scanner.close();
    }
}

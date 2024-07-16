import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: CONHECER E IMPORTAR A CLASSE SCANER

        //EXIBIR AS MENSAGENS PARA O NOSSO USUARIO

        //OBTER PELA CLASSE SCANER OS VALORES DIGITADOS PELO TEMINAL

        //EXIBIR A MENSAGEM DA CONTA CRIADA 

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Por favor , digite o número da Conta!");
        int conta = scanner.nextInt();

        scanner.nextLine();
         
        System.out.println("Digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println(" Digite o seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo desejado ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia +", conta " + conta + " e seu saldo " + saldo +
        " já está disponivel para saque" );
        }

    }
}
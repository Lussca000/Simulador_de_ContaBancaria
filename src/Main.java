import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializar dados
        String nome = "Lucas";
        String tipoConta = "Corrente";
        double saldo = 5000;
        int opcao = 0;

        System.out.println("##########################");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n##########################");

        String menu = """
                \n
                ** Digite sua opção: **
                1 - Consultar saldo
                2 - Realizar transferência
                3 - Receber transferência
                4 - Sair
                """;
        //Fazer o menu de opções
        Scanner lerMenu = new Scanner(System.in);
        while (opcao !=4) {
            System.out.println(menu);
            opcao = lerMenu.nextInt();
            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = lerMenu.nextDouble();
                if (valor > saldo) {
                    System.out.println("Sem saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado com sucesso! " + saldo);
                }
            }else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = lerMenu.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado com sucesso! " + saldo);
            }else if (opcao == 4) {
                System.out.println("Encerrando o programa...");
            }
        }

    }
}
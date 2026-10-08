import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(" ");
        System.out.println("Nome: Jacqueline Oliveira");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial: R$ 2500,00");
        System.out.println("******************************");

        double saldoAtual = 2500;
        Scanner leitura = new Scanner(System.in);
        String entrada = "";

        // laço principal
        while (!"4".equals(entrada)) {
            System.out.println("\nOperações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Digite a operação desejada: ");

            entrada = leitura.nextLine();

            try {
                int opcao = Integer.parseInt(entrada); // tenta converter para número

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo atual: R$ " + saldoAtual);
                        break;
                    case 2:
                        System.out.print("Digite o valor a receber: ");
                        double valorReceber = Double.parseDouble(leitura.nextLine());
                        saldoAtual += valorReceber;
                        System.out.println("Novo saldo: R$ " + saldoAtual);
                        break;
                    case 3:
                        System.out.print("Digite o valor a transferir: ");
                        double valorTransferir = Double.parseDouble(leitura.nextLine());
                        if (valorTransferir <= saldoAtual) {
                            saldoAtual -= valorTransferir;
                            System.out.println("Transferência realizada! Novo saldo: R$ " + saldoAtual);
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Digite um número entre 1 e 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
            }
        }
    }
}

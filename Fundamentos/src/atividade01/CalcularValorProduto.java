package atividade01;

import java.util.Scanner;

public class CalcularValorProduto {
    
 


    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar o nome do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Solicita ao usuário para digitar o valor do produto
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Solicita ao usuário para digitar a quantidade do produto
        System.out.print("Digite a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        // Calcula o valor total da compra
        double valorTotalCompra = valorProduto * quantidadeProduto;

        // Solicita ao usuário para escolher a forma de pagamento ("D" para débito, "C" para crédito)
        System.out.print("Digite a forma de pagamento (D - débito, C - crédito): ");
        char formaPagamento = scanner.next().charAt(0);

        // Verifica se a forma de pagamento é débito ou crédito e aplica o desconto correspondente
        if (formaPagamento == 'D' || formaPagamento == 'd') {
            if (valorTotalCompra <= 100) {
                valorTotalCompra *= 0.95; // Aplica desconto de 5% para compra no débito abaixo de R$ 100
            } else {
                valorTotalCompra *= 0.97; // Aplica desconto de 3% para compra no débito acima de R$ 100
            }
            System.out.println("Compra no débito com desconto aplicado.");
        } else if (formaPagamento == 'C' || formaPagamento == 'c') {
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            double valorParcela = valorTotalCompra / numeroParcelas;
            System.out.println("Compra parcelada em " + numeroParcelas + " vezes de R$ " + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida!");
            // Fecha o objeto Scanner
            scanner.close();
            return; // Encerra o programa se a forma de pagamento for inválida
        }

        // Exibe as informações da compra
        System.out.println("Informações da compra:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + valorProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Total da compra: R$ " + valorTotalCompra);

        // Fecha o objeto Scanner
        scanner.close();
    }
}




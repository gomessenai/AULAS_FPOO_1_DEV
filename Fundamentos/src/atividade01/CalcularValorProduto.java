package atividade01;

import java.util.Scanner;

public class CalcularValorProduto {
    
 


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        
        System.out.print("Digite a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        
        double valorTotalCompra = valorProduto * quantidadeProduto;

        
        System.out.print("Digite a forma de pagamento (D - débito, C - crédito): ");
        char formaPagamento = scanner.next().charAt(0);

        
        if (formaPagamento == 'D' || formaPagamento == 'd') {
            if (valorTotalCompra <= 100) {
                valorTotalCompra *= 0.95; 
            } else {
                valorTotalCompra *= 0.97; 
            }
            System.out.println("Compra no débito com desconto aplicado.");
        } else if (formaPagamento == 'C' || formaPagamento == 'c') {
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            double valorParcela = valorTotalCompra / numeroParcelas;
            System.out.println("Compra parcelada em " + numeroParcelas + " vezes de R$ " + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida!");
            
            scanner.close();
            return; 
        }

        
        System.out.println("Informações da compra:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + valorProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Total da compra: R$ " + valorTotalCompra);

        
        scanner.close();
    }
}




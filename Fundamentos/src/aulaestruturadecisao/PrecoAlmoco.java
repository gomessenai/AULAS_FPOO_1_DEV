package aulaestruturadecisao;

import java.util.Scanner;

public class PrecoAlmoco {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato desejado:");
        System.out.println("1 - Arroz, feijão, bife acebolado (R$ 19,99)");
        System.out.println("2 - Arroz, feijão, filé de frango (R$ 18,99)");
        System.out.println("3 - Arroz, feijão, brajola (R$ 23,99)");

        int opcao = scanner.nextInt();
        double valorPrato = 0.0;

        switch (opcao) {
            case 1:
                valorPrato = 19.99;
                break;
            case 2:
                valorPrato = 18.99;
                break;
            case 3:
                valorPrato = 23.99;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Informe a quantidade de pratos:");
        int quantidade = scanner.nextInt();

        double valorTotal = valorPrato * quantidade;

        System.out.println("Prato escolhido: " + opcao);
        System.out.println("Valor unitário: R$ " + valorPrato);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + valorTotal);
    }
}




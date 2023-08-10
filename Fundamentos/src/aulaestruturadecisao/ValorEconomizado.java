package aulaestruturadecisao;

import java.util.Scanner;

public class ValorEconomizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itens = {"Notebook Lenovo", "Celular MotoG22", "Carro Hb20", "Apartamento"};
        double[] valores = {3299.0, 1789.0, 68000.0, 180000.0};
        double[] percentuais = {0.05, 0.1, 0.02, 0.01};

        System.out.println("Escolha o item desejado:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + " - " + itens[i] + " (R$ " + valores[i] + ")");
        }

        int opcao = scanner.nextInt();
        if (opcao < 1 || opcao > itens.length) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Informe o valor que você pode economizar por mês (em Reais) :");
        double economiaMensal = scanner.nextDouble();

        double valorTotal = valores[opcao - 1];
        double percentualEconomia = percentuais[opcao - 1];

        int meses = (int) (valorTotal / economiaMensal);

        System.out.println("Item escolhido: " + itens[opcao - 1]);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Percentual de economia: " + (percentualEconomia * 100) + "%");
        System.out.println("Economia mensal: R$ " + economiaMensal);
        System.out.println("Quantidade de meses necessários: " + meses);
    }
}

package aulaestruturadecisao;

import java.util.Scanner;

public class CalcularAluguel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] veiculos = {"Fiat Argo", "Fiat Mobi", "Hyundai Hb20"};
        double[] valorDiaria = {98.0, 79.0, 102.0};
        double[] valorPorKm = {2.39, 1.99, 2.99};

        System.out.println("Escolha o veículo desejado:");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println((i + 1) + " - " + veiculos[i]);
        }

        int opcao = scanner.nextInt();
        if (opcao < 1 || opcao > veiculos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Informe a quantidade de dias que você deseja alugar o veículo:");
        int dias = scanner.nextInt();

        System.out.println("Informe a quantidade de km rodados:");
        double kmRodados = scanner.nextDouble();

        double valorTotalDiaria = valorDiaria[opcao - 1] * dias;
        double valorTotalKm = valorPorKm[opcao - 1] * kmRodados;
        double valorTotal = valorTotalDiaria + valorTotalKm;

        System.out.println("Veículo escolhido: " + veiculos[opcao - 1]);
        System.out.println("Dias de aluguel: " + dias);
        System.out.println("Km rodados: " + kmRodados + " km");
        System.out.println("Valor total da diária: R$ " + valorTotalDiaria);
        System.out.println("Valor total por km rodado: R$ " + valorTotalKm);
        System.out.println("Valor total do aluguel: R$ " + valorTotal);
    }
}

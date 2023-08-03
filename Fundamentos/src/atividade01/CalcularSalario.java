package atividade01;

import java.util.Scanner;

public class CalcularSalario {
    


    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        // Calcula o percentual de aumento e o valor do aumento
        double percentualAumento = (salario > 1350.0) ? 0.10 : 0.15;
        double aumento = salario * percentualAumento;

        // Calcula o novo salário com o aumento aplicado
        double novoSalario = salario + aumento;

        // Exibe as informações
        System.out.println("Salário atual: R$ " + salario);
        System.out.println("Percentual de aumento: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        // Fecha o objeto Scanner
        scanner.close();
    }
}

    
    



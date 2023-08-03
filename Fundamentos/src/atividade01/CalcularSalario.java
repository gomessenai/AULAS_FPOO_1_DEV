package atividade01;

import java.util.Scanner;

public class CalcularSalario {
    


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        
        double percentualAumento = (salario > 1350.0) ? 0.10 : 0.15;
        double aumento = salario * percentualAumento;

       
        double novoSalario = salario + aumento;

        
        System.out.println("Salário atual: R$ " + salario);
        System.out.println("Percentual de aumento: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        
        scanner.close();
    }
}

    
    



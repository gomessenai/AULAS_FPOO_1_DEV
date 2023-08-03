package atividade01;

import java.util.Scanner;

public class Emprestimo {
    


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor da casa a comprar: R$ ");
        double valorCasa = scanner.nextDouble();

        
        System.out.print("Digite o salário da pessoa: R$ ");
        double salario = scanner.nextDouble();

        
        System.out.print("Digite a quantidade de anos a pagar: ");
        int anosPagar = scanner.nextInt();

        
        int mesesPagar = anosPagar * 12;
        double prestacaoMensal = valorCasa / mesesPagar;

        
        double limitePrestacao = salario * 0.30;

        
        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor da prestação mensal: R$ " + prestacaoMensal);
        } else {
            System.out.println("Empréstimo não aprovado. O valor da prestação excede 30% do salário.");
            System.out.println("Limite de prestação mensal permitido: R$ " + limitePrestacao);
        }

        
        scanner.close();
    }
}


    

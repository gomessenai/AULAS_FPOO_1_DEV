package atividade01;

import java.util.Scanner;

public class Energia {
    


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de KW/h consumido: ");
        double consumoKW = scanner.nextDouble();

        
        System.out.print("Digite o tipo de instalação (R - residência, I - indústria, C - comércio): ");
        char tipoInstalacao = scanner.next().charAt(0);

        
        double precoPorKW;
        if (tipoInstalacao == 'R' || tipoInstalacao == 'r') {
            if (consumoKW <= 500) {
                precoPorKW = 0.40;
            } else {
                precoPorKW = 0.65;
            }
        } else if (tipoInstalacao == 'I' || tipoInstalacao == 'i') {
            if (consumoKW <= 1000) {
                precoPorKW = 0.55;
            } else {
                precoPorKW = 0.60;
            }
        } else if (tipoInstalacao == 'C' || tipoInstalacao == 'c') {
            if (consumoKW <= 5000) {
                precoPorKW = 0.55;
            } else {
                precoPorKW = 0.60;
            }
        } else {
            System.out.println("Tipo de instalação inválido!");
            
            scanner.close();
            return; 
        }

        
        double valorTotalPagar = consumoKW * precoPorKW;

        
        System.out.println("O valor total a pagar é: R$ " + valorTotalPagar);

        
        scanner.close();
    }
}




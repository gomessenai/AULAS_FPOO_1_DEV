package atividade01;

import java.util.Scanner;

public class Radar {
    
    


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a velocidade do carro em km/h: ");
        int velocidadeCarro = scanner.nextInt();

        
        if (velocidadeCarro > 80) {
            int velocidadeAcimaLimite = velocidadeCarro - 80;
            double valorMulta = velocidadeAcimaLimite * 5.0;
            System.out.println("Você foi multado! Velocidade acima do limite.");
            System.out.println("Velocidade acima do limite: " + velocidadeAcimaLimite + " km/h");
            System.out.println("Valor da multa: R$ " + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }

        
        scanner.close();
    }
}




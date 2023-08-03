package atividade01;

import java.util.Scanner;

public class DistanciaPass {
    



    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a distância da viagem em km: ");
        int distanciaViagem = scanner.nextInt();

        
        double precoPassagem;
        if (distanciaViagem <= 200) {
            precoPassagem = distanciaViagem * 0.50;
        } else {
            precoPassagem = distanciaViagem * 0.45;
        }

        
        System.out.println("O preço da passagem é: R$ " + precoPassagem);

       
        scanner.close();
    }
}




package atividade01;

import java.util.Scanner;

public class CalcularAreaCirculo {
  
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio");
        double raio =scanner.nextDouble();
        
        double area = Math.PI *Math.pow(raio, 2);
        
        System.out.println("A área do circulo é " + area);
        
        scanner.close();
    }
}

 
    



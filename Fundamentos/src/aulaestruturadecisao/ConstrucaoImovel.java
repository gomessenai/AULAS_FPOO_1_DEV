package aulaestruturadecisao;

import java.util.Scanner;

public class ConstrucaoImovel {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a largura do terreno em metros:");
        double largura = scanner.nextDouble();

        System.out.println("Informe o comprimento do terreno em metros:");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;
        double valorMetroQuadrado;

        if (area <= 250) {
            valorMetroQuadrado = 8.50;
        } else if (area <= 350) {
            valorMetroQuadrado = 9.50;
        } else {
            valorMetroQuadrado = 11.50;
        }

        double valorTotal = area * valorMetroQuadrado;

        System.out.println("Área do terreno: " + area + " m²");
        System.out.println("Valor por m²: R$ " + valorMetroQuadrado);
        System.out.println("Valor total: R$ " + valorTotal);
    }
}

    



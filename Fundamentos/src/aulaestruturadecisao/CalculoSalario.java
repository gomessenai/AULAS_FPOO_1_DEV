package aulaestruturadecisao;

import java.util.Scanner;

public class CalculoSalario {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o cargo do funcionário (gerente, supervisor, tecnico ou auxiliar):");
        String cargo = scanner.nextLine();

        double salarioBase;
        double inss;
        double convenio;

        switch (cargo.toLowerCase()) {
            case "gerente":
                salarioBase = 5590.00;
                inss = 8.0;
                convenio = 289.00;
                break;
            case "supervisor":
                salarioBase = 4128.00;
                inss = 7.0;
                convenio = 239.00;
                break;
            case "tecnico":
                salarioBase = 3789.00;
                inss = 4.0;
                convenio = 189.00;
                break;
            case "auxiliar":
                salarioBase = 2345.00;
                inss = 2.0;
                convenio = 156.00;
                break;
            default:
                System.out.println("Cargo inválido.");
                return;
        }

        double descontoInss = salarioBase * (inss / 100);
        double salarioLiquido = salarioBase - descontoInss - convenio;

        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}


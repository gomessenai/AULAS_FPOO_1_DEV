/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Concessionária {

    public static void main(String[] args) {
        Carro carro1 = new Carro(" Gol", " Volksvagem", " Preto", 2020, 4);
        System.out.println(carro1);
        
        carro1.andar(40);
        carro1.andar(70);
        System.out.println(carro1);
    }

}

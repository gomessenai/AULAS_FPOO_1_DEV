/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rogero", "Rogeriolegal@gmail.com", 3415, 16);
        
        System.out.println(aluno1);
        
        aluno1.estudo(2);
        System.out.println(aluno1);
    }
    
}

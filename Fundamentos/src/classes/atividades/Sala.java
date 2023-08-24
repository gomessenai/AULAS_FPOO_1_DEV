/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Sala {
    public static void main(String[] args) {
        SalaClasses sala = new SalaClasses(34, 34, 2, true, 6);
        
        System.out.println(sala);
        
        sala.computadores(6);
        sala.computadores(9);
        
        System.out.println(sala);
    }
}

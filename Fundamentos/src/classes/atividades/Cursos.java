/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Cursos {
    public static void main(String[] args) {
        
        CursoClasses curso1 = new CursoClasses("Administração", "Curso profissionalizante para interessados em administração", CursoEnum.ADM);
        
        System.out.println(curso1);
        
        curso1.inscrever(1);
        curso1.inscrever(1);
        
        System.out.println(curso1);
    }
    
}

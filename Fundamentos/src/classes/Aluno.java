/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    
    private String nome;
    private String email;
    private int ra;
    private int idade;
    private String estudando;
    private int livrosLidos;

    public Aluno(String nome, String email, int ra, int idade) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.idade = idade;
        this.estudando = "Procastinando";
        this.livrosLidos = 0;
    }
     public void estudo(int livrosLidos) {
     
        this.estudando = "Estudando";
        this.livrosLidos = livrosLidos;
        
    }
    
    public void progresso(){
        
        this.estudando = "Estudando";
        this.livrosLidos += 1;
    


    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", idade=" + idade + ", Estudando=" + estudando + ", livrosLidos=" + livrosLidos + '}';
    }
    
    
    
    
    
}

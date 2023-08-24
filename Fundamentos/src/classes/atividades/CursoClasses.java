/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class CursoClasses {
    
        private String nome;
        private String descricão;
        private CursoEnum cursnoEnum;
        private int inscriçoes;

    public CursoClasses(String nome, String descricão, CursoEnum cursnoEnum) {
        this.nome = nome;
        this.descricão = descricão;
        this.cursnoEnum = cursnoEnum;
        this.inscriçoes = 0;
    }
    public void inscritos(int inscriçoes){
        this.inscriçoes = inscriçoes;
        
        
        
        
    }

     public void inscrever (int inscriçoes){
         this.inscriçoes += 1;
     }

    @Override
    public String toString() {
        return "CursoClasses{" + "nome=" + nome + ", descric\u00e3o=" + descricão + ", cursnoEnum=" + cursnoEnum + ", inscri\u00e7oes=" + inscriçoes + '}';
    }
     
  
    }
    
    
        
        
    


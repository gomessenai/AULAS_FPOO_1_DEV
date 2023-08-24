/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class ComputadorClasses {
    
    private int memoria;
    private ProcessadorEnum processador;
    private int capacidadeDisco;
    private String sistemaOperacional;
    private MemoriaEnum memoriaEnum;

    public ComputadorClasses(int memoria, MemoriaEnum memoriaEnum, ProcessadorEnum processador, int capacidadeDisco, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDisco = capacidadeDisco;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaEnum = memoriaEnum;
    }

    @Override
    public String toString() {
        return "ComputadorClasses{" + "memoria=" + memoria + "GB " + memoriaEnum + ", processador=" + processador + ", capacidadeDisco=" + capacidadeDisco + "GB  , sistemaOperacional=" + sistemaOperacional +  '}';
    }

   
    }


    
    
    


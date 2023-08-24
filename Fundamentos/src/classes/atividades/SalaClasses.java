/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class SalaClasses {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputadores;
    private int computadoresLigados;

    public SalaClasses(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numeroComputadores) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.computadoresLigados = computadoresLigados;
    }
    
    public void computadores(int computadoresLigados){
        this.computadoresLigados = computadoresLigados;
    }
            public void ligar (int computadoresLigados){
                this.computadoresLigados += 1;
            }

    @Override
    public String toString() {
        return "SalaClasses{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + ", computadoresLigados=" + computadoresLigados + '}';
    }


    }
    
    
    
    
    

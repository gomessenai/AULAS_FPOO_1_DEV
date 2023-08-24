/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int rodas;
    private String situacao;
    private int velocidade;
    private int marcha;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.situacao = "Parado";
        this.velocidade = 0;
        this.marcha = marcha;
    }
    
    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        
        if (diferenca == 1) {
            
             this.marcha = novaMarcha.getNumeroMarcha();
            
        } else { 
            System.out.println("Voce nao pode pular a marcha ");
        
       
        
    }
    
    
        
    }
    
    public void freiar(){
        
        this.situacao = "Freiando";
        this.velocidade -= 1;

 
    
    
    
}

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", situacao=" + situacao + ", velocidade=" + velocidade + ", marcha=" + marcha + '}';
    }


    }

  
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Itens {
    
    private produtosEnum produto;

    public Itens(produtosEnum produto) {
        this.produto = produto;
    }
    public void setProduto(produtosEnum produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Itens{" + "produto=" + produto + '}';
    }
    }
        
        
  

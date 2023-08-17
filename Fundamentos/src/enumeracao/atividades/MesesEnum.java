/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum MesesEnum {
    JANEIRO("1"),
    FEVEREIRO("2"),
    MARÇO ("3"),
    ABRIL("4"),
    MAIO("5"),
    JUNHO ("6"),
    JULHO("7"),
    AGOSTO ("8"),
    SETEMBRO ("9"),
    OUTUBRO("10"),
    NOVEMBRO("11"),
    DEZEMBRO("12");
    
    private String status;

    private MesesEnum(String status) {
        this.status = status;
    }
     public String getStatus() {
         return this.status;
     }
    
}

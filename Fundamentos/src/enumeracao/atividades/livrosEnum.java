
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum livrosEnum {
    
    TERROR("Terror"),
    AVENTURA("Aventura"),
    RECEITAS("Receitas"),
    FICÇÃO("Ficção"),
    ROMANCE("Romance");
    
    private String status;

    private livrosEnum(String status) {
        this.status = status;
    }

public String getStatus(){
    return this.status;
    }
    
    
    
    
    
}

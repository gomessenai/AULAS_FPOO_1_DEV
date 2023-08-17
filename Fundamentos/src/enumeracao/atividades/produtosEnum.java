
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum produtosEnum {
    COXINHA9("Coxinha"),
    CAFE("Café"),
    CHOCOLATE("Chocolate"),
    BALA("Bala"),
    PIRULITO("Pirulito"),
    PACOCA("Paçoca"),
    PICOLE("Picolé"),
    CHICLETE("Chiclete");
    
    private String status;

    private produtosEnum(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
        
        
    }
    
    
    
}

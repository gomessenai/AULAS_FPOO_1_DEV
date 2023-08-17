
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum redesEnum {
    
    TWITTER("Twitter"),
    INSTAGRAM("Instagram"),
    FACEBOOK("Facebook");
    
    private String status;

    private redesEnum(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
}

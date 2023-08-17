
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Livros {
    
    private  livrosEnum livro;

    public Livros(livrosEnum livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "livros{" + "livro=" + livro + '}';
    }
    
    
}

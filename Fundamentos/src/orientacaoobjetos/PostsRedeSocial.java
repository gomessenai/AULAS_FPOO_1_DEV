package orientacaoobjetos;

import com.sun.source.tree.IfTree;

public class PostsRedeSocial implements PostInterface{
    private String titulo;
    private String conteudo;
    private int qtdeComentarios;
    private int estrelas;

    public PostsRedeSocial(String titulo, String conteudo, int qtdeComentarios) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.qtdeComentarios = qtdeComentarios;
        
        
        
    }

    @Override
    public String toString() {
        return "Post: " + "titulo: " + titulo + ", conteudo: " + conteudo + ", qtdeComentarios: " + qtdeComentarios;
        
        
    }
    
    //Numero padrao é 1
    
    public int numeroPadraoCafe(int numeroPadrao) {
        return numeroPadrao * POST_SUPER_LEGAL;  
    }
        
        public int numeroPadraoWhey (int numeroPadraoWhey) {
        return numeroPadraoWhey * POST_LEGAL;  
    
    
}
        public int numeroPadraoCha (int numeroPadraoCha) {
            return numeroPadraoCha * POST_COMUM;
        }
}

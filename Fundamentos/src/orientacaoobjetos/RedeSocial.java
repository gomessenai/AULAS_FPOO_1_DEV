package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        PostsRedeSocial p1 = new PostsRedeSocial("Receita de CafÉ", "Ingredientes: Café", 4);
        System.out.println(p1);
        int quantidadeEstrelas = p1.numeroPadraoCafe(1);
        System.out.println("Quantidade de estrelas:  " + quantidadeEstrelas);
        
        PostsRedeSocial p2 = new PostsRedeSocial("Whey", "Como utilizar whey", 4);
        System.out.println(p2);
        int quatidadeEstrelas2 = p2.numeroPadraoWhey(1);
        System.out.println("Quantidade de estrelas: " + quatidadeEstrelas2);
        
        PostsRedeSocial p3 = new  PostsRedeSocial("Chá", "Como Fazer Chá", 8);  
        System.out.println(p3);
        int quantidadeEstrelas3 = p3.numeroPadraoCha(1);
        System.out.println("Quantidade de estrelas: " + quantidadeEstrelas3);
        
        
        
        
        
    }
    
}

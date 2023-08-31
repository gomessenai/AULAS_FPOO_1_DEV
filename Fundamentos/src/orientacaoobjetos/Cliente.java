package orientacaoobjetos;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
            
            return "Cliente:\n" + "nome: " + nome;
            
        } else {
            return "Cliente:\n" + "nome: " + nome + ", email: " + email;
        }
        
    }
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * 3.99;
    }
    public double calcularLocacao (int qtdeDias, boolean lancamento){
        
        return qtdeDias * 6.99;
    }
         
   

    
    
    
}

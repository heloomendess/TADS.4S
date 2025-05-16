public class Funcionario implements Observadores {
    
    private String nome;
    
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Funcionário " + nome + " (" + cargo + "): " + mensagem);
    }
}
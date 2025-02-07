public class PessoaFisica extends Pessoa{

    long cpf;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica {" +
                "nome=" + getNome() +
                " | cpf=" + cpf +
                '}';
    }
}

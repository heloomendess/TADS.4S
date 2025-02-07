public class PessoaJuridica extends Pessoa {

    int cnpj;

    public PessoaJuridica(String nome, int cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica {" +
                "nome=" + getNome() +
                " | cnpj=" + cnpj +
                '}';
    }
}

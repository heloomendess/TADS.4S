public class Funcionario extends PessoaFisica{

    int matricula;

    public Funcionario(String nome, int cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "nome= " + getNome() +
                " | cpf= " + getCpf() +
                " | matricula=" + matricula +
                '}';
    }
}

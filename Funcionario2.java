public class Funcionario2 {

    private String nome;
    private double salario;

    public Funcionario2(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario2{" +
                "nome= " + nome +
                ", salario= " + salario +
                '}';
    }
}
public class Gerente extends Funcionario2 {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void alterarSalario(Funcionario2 funcionario2, double novoSalario) {
        funcionario2.setSalario(novoSalario);
    }

}
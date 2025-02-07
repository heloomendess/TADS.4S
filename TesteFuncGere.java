public class TesteFuncGere {
    public static void main(String[] args) {

        Funcionario2 funcionario1 = new Funcionario2("Catarina", 3000.00);
        Gerente gerente1 = new Gerente("Juliana", 5000.00);

        System.out.println("Salário de " + funcionario1.getNome() + ": " + funcionario1.getSalario());

        gerente1.alterarSalario(funcionario1, 3500.00);

        System.out.println("Salário de " + funcionario1.getNome() + " após alteração: " + funcionario1.getSalario());
        
    }
}

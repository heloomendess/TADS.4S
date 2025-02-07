//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Heloisa");
        System.out.println(p1.toString());

        PessoaFisica pf = new PessoaFisica("Juliana", 243_212_342);
        System.out.println(pf.toString());

        PessoaJuridica pj = new PessoaJuridica("Mariana", 123421211);
        System.out.println(pj.toString());

        Funcionario func = new Funcionario("Catarina", 12434342, 323323);
        System.out.println(func.toString());

    }
}
package padrao;

import plataforma.Tarefa;

public class Atrasada implements Estados {

    private String label = "Atrasado";
    private Tarefa tarefa;

    public Atrasada(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        System.out.printf("Já está atrasado");
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está atrasada!");
    }
}

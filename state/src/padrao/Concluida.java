package padrao;

import plataforma.Tarefa;

public class Concluida implements Estados {

    private String label = "Concluida";
    private Tarefa tarefa;

    public Concluida(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        System.out.println("Já esta concluida");
    }

    @Override
    public void concluir() {
        System.out.println("Já está concluida!");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }
}

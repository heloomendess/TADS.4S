package padrao;

import plataforma.Tarefa;

public class Pendente implements Estados {

    private String label = "Pendente";
    private Tarefa tarefa;

    public Pendente(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está pendente");
    }

    @Override
    public String toString() {
        return "Pendente{" +
                "label='" + label + '\'' +
                '}';
    }
}

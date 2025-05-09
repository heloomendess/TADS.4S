package plataforma;

public class Gerenciador {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("ADO", "tralalal");
        System.out.println("Estado atual: " + tarefa.getEstado());
        tarefa.acionarPendente();
        tarefa.acionarAtrasada();
        tarefa.acionarConcluida();

    }
}

import java.util.ArrayList;
import java.util.List;

public class Fachada {

    //Adicionando itens
    private List<String> lista = new ArrayList<>(); 
    private Pedido pedido;

    public boolean temPedido() {
        return pedido != null;
    }

    public void adicionarItem(String item) {
        lista.add(item);
    }

    //Realizando pedido
    public void realizarPedido() {
        if (!lista.isEmpty()) {
            pedido = new Pedido(lista);
        } else {
            System.out.println("Nenhum item foi adicionado ao pedido");
        }
    }

    //Observadores do pedido
    public void adicionarObservadores(Observador) {
        //Anexando os observadores ao pedido
        if(temPedido()) {
            pedido.registrarObservadores(observador);
        } else {
            System.out.println("Nenhum pedido foi realizado");
        }
    }

    //Ciclo de vida do pedido
    public void alterarStatusPedido() {
        if (pedido.temObservadores()) {
            pedido.avancarEstado();
        } else {
            System.out.println("Nenhum observador foi adicionado ao pedido");
        }
    }

    public void exibirPedido() {
        if (temPedido()) {
            System.out.println("Detalhes do pedido");
            System.out.println("Estado inicial do pedido: " + pedido);
        } else {
            System.out.println("Nenhum pedido foi realizado");
        }
    }
}
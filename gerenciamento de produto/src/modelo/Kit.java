package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects; // a classe object é a super classe do java; aceita qualquer coisa

public class Kit {

    private String nome;
    private List<Objects>lista;

    public Kit(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public void adicionar(Object item) {
        // regras de negocios
        lista.add((Objects) item);
    }

    public double precoTotal() {
        double total = 0;
        for (Object obj : lista) { //forint
            if (obj instanceof Item item) { //"instanceof" verifica se a variavel é da classe Item
                total += item.getPreco();
            } else if(obj instanceof Kit kit) {
                total += kit.precoTotal();
            }
        }
        return total;
    }
}

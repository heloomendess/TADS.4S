package principal;

import modelo.Item;
import modelo.Kit;
import modelo.Produto;

public class RealizarCompras {
    public static void main(String[] args) {

        Kit kit1 = new Kit("Caixa");
        Produto produto1 = new Item("Caneta 1", 1);
        Produto produto2 = new Item("Caneta 2", 1);
        Produto produto3 = new Item("Caneta 3", 1);
        Produto produto4 = new Item("Caneta 4", 1);

        kit1.adicionar(produto1);
        kit1.adicionar(produto2);
        kit1.adicionar(produto3);
        kit1.adicionar(produto4);

        Kit kit2 = new Kit("Box");
        kit2.adicionar(new Item("Lápis", 2.5));
        kit2.adicionar(new Item("Caderno", 3.4));
        kit2.adicionar(kit1);

        System.out.println("Total: " + kit2.getPreco());
        System.out.println("Lista de compras: " + kit2);
    }
}

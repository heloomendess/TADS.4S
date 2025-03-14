package principal;

import modelo.*;

public class RealizarCompra {
    public static void main(String[] args) {

        Kit kit1 = new Kit("Caixa de caneta");

        Item item1 = new Item("Caneta 1", 3.0);
        Item item2 = new Item("Caneta 2", 3.0);
        Item item3 = new Item("Caneta 3", 3.0);
        Item item4 = new Item("Caneta 4", 3.0);

        kit1.adicionar(item1);
        kit1.adicionar(item2);
        kit1.adicionar(item3);
        kit1.adicionar(item4);

        Kit kit2 = new Kit("Escritorio");
        kit2.adicionar(new Item("Borracha", 6.0));
        kit2.adicionar(new Item("Regua", 6.0));
        kit2.adicionar(kit1);
    }
}

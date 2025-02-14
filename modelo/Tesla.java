package modelo;

public class Tesla implements CarroEAutonomo {

    private int carga;
    private String partida;
    private String destino;
    private boolean modoAutonomo;

    public Tesla() {
    }

    public Tesla(int carga) {
        this.carga = carga;
    }

    @Override
    public void monitorarBateria() {
        System.out.println("Carga da bateria: " + carga);
    }

    @Override
    public void definirRota(String partida, String destino) {
        this.partida = partida;
        this.destino = destino;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando...");
    }

    @Override
    public void ligarModoAutonomo() {
        modoAutonomo = true;
    }

    @Override
    public void desligarModoAutonomo() {
        modoAutonomo = false;
    }

    @Override
    public String toString() {
        return "Tesla: " +
                "Carga= " + carga +
                ", Partida= " + partida +
                ", Destino= " + destino +
                ", Modo Autonomo= " + modoAutonomo;
    }
}

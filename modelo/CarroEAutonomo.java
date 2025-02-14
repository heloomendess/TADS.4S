package modelo;

public interface CarroEAutonomo extends VeiculoAutonomo {

    public void monitorarBateria();
    public void definirRota(String partida, String destino);

    void carregarBateria();
}

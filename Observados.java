public interface Observados {

    public void registrarObservadores(Observadores observador);
    public void removerObservadores(Observadores observador);
    public void notificarObservadores(String mensagem);
}
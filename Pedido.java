public class Pedido implements Observados {
    private List<String> listaItens;
    private List<Observadores> ListaObservadores;
    private Estado estado;

    public Pedido(List<String> listaItens) {
        this.listaItens = listaItens;
        this.ListaEstados.PENDENTE;
        listaPbservadores = new ArrayList<>();
    }

    public boolean temObservadores() {
        return !ListaObservadores.isEmpty();
    }

    public void setEstado(Estado estado) {
        if (estado != null) {
            this.estado = estado;
        } else {
            this.estado = ListaEstados.ENTREGUE;
        }
    }
    
    public void avancarEstado() {
        estado.proximoEstado(this);
    }

    @Override
    public void registrarObservadores(Observadores observadores) {
        ListaObservadores.add(observadores);
    }

    @Override
    public void removerObservadores(Observadores observadores) {
        ListaObservadores.remove(observadores);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observadores observador : ListaObservadores) {
            observador.atualizar(mensagem);
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "listaItens=" + listaItens +
                ", estado=" + estado +
                '}';
    }
}
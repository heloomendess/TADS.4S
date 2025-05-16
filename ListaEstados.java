public enum ListaEstados implements Estado {
    PENDENTE {
        @Override
        public void proximoEstado(Pedido pedido) {
            pedido.setEstado(EM_SEPARACAO);
            pedido.notificarObservadores("está em separação!");
        }
    },
    EM_PROCESSAMENTO {
        @Override
        public void proximoEstado(Pedido pedido) {
            pedido.setEstado(ROTA);
            pedido.notificarObservadores("está em rota de entrega!");
        }
    },
    ROTA {
        @Override
        public void proximoEstado(Pedido pedido) {
            System.out.println(ENTREGUE);
            pedido.notificarObservadores("está entregue!");
        }
    };
    ENTREGUE {
        @Override
        public void proximoEstado(Pedido pedido) {
            pedido.setEstado(null);
            pedido.notificarObservadores("já foi entregue!");
        }
    }
}
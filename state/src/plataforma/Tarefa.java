package plataforma;

import padrao.Estados;
import padrao.Pendente;

public class Tarefa {

    private String codigo;
    private String descricao;
    private Estados estado;

    public Tarefa(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        estado = new Pendente(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Metodos que serão acessados pelo Main (Gerenciador)

    public void acionarAtrasada() {
        estado.atrasar();
    }

    public void acionarConcluida() {
        estado.concluir();
    }

    public void acionarPendente() {
        estado.pendente();
    }

}

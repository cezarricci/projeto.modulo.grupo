package entities;

public class Cliente {
    private String idCliente = "00000000000000";
    private String nomeCliente = "Nome Completo";
    private String tipoPessoaCliente = "NAO_DEFINIDO";

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoPessoaCliente() {
        return tipoPessoaCliente;
    }

    public void setTipoPessoaCliente(String tipoPessoaCliente) {
        this.tipoPessoaCliente = tipoPessoaCliente;
    }

    public Cliente(String IDCliente, String nomeCliente, String tipoPessoaCliente) {
        this.idCliente = IDCliente;
        this.nomeCliente = nomeCliente;
        this.tipoPessoaCliente = tipoPessoaCliente;
    }
}

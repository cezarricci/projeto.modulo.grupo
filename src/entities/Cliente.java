package entities;

public class Cliente {
    private String IDCliente = "00000000000000";
    private String NomeCliente = "Nome Completo";
    private String TipoPessoaCliente = "NAO_DEFINIDO";

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public String getTipoPessoaCliente() {
        return TipoPessoaCliente;
    }

    public void setTipoPessoaCliente(String tipoPessoaCliente) {
        TipoPessoaCliente = tipoPessoaCliente;
    }
}

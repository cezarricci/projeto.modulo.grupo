package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaNova {
    private Integer IDConta = 0;
    private String IDCliente = "00000000000000";
    private String TipoConta = "CONTA_CORRENTE";
    private BigDecimal Saldo = BigDecimal.valueOf(0).setScale(4, RoundingMode.HALF_EVEN);


    public Integer getIDConta() {
        return IDConta;
    }

    public void setIDConta(Integer IDConta) {
        this.IDConta = IDConta;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(String tipoConta) {
        TipoConta = tipoConta;
    }

    public BigDecimal getSaldo() {
        return Saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        Saldo = saldo;
    }

    public ContaNova(Integer IDConta, String IDCliente, String tipoConta) {
        this.IDConta = IDConta;
        this.IDCliente = IDCliente;
        this.TipoConta = tipoConta;
    }
}

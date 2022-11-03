package entities;

import entities.enums.TipoConta;
import entities.enums.TipoPessoa;

import java.util.ArrayList;

public class Conta {

    private String nome;
    private String numeroConta;
    private double saldoContaDef;

    private TipoPessoa tipoPessoa;
    private TipoConta tipoConta;

    public Conta(String nome, String numeroConta, double saldoContaDef, TipoPessoa tipoPessoa, TipoConta tipoConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoContaDef = saldoContaDef;
        this.tipoPessoa = tipoPessoa;
        this.tipoConta = tipoConta;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    SaldoConta saldoConta = new SaldoConta();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void getsaldoContaDef() {
        saldoConta.getSaldo();
    }

    public void setsaldoContaDef(double saldoContaDef) {
        saldoConta.setSaldo(saldoContaDef);
    }
}

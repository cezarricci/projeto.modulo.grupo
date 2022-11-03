package entities;

import entities.enums.TipoConta;
import entities.enums.TipoContaJuridica;
import entities.enums.TipoPessoa;

import java.util.ArrayList;

public class Conta {

    private String nome;
    private String numeroConta;
    private double saldoContaDef;

    private String regCompleto;

    private int controleInsert;

    private TipoPessoa tipoPessoa;

    private TipoContaJuridica tipoContaJuridica;
    private TipoConta tipoConta;

    ArrayList<String> conta = new ArrayList();

    public String regCompleto() {
        return regCompleto;
    }

    public String getRegCompleto() {
        return regCompleto;
    }

    public Conta(String nome, String numeroConta, double saldoContaDef, String tipoPessoa, String tipoConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoContaDef = saldoContaDef;
        this.tipoPessoa = TipoPessoa.valueOf(tipoPessoa);
        this.tipoConta = TipoConta.valueOf(tipoConta);
        this.regCompleto = nome + ";" + numeroConta + ";" + saldoContaDef + ";" + tipoPessoa + ";" + tipoConta;
    }

    public void addConta(int i, String dadosConta) {
        dadosConta = i + ";" + dadosConta;
        conta.add(dadosConta);
    }

    public ArrayList<String> getConta() {
        return conta;
    }

    public String getContas(int j) {
        return conta.get(j);
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoContaJuridica getTipoContaJuridica() {
        return tipoContaJuridica;
    }

    public void setTipoContaJuridica(TipoContaJuridica tipoContaJuridica) {
        this.tipoContaJuridica = tipoContaJuridica;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    SaldoConta saldoConta = new SaldoConta();

    public double getSaldoContaDef() {
        return saldoContaDef;
    }

    public void setSaldoContaDef(double saldoContaDef) {
        this.saldoContaDef = saldoContaDef;
    }

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

    public int getControleInsert() {
        String[] str = getConta().toArray(new String[0]);
        System.out.println("str: " + str);
        String[] split = str(";");
        System.out.println(split);
        String str2 = split[0];
        return controleInsert =Integer.parseInt(str2) ;
    }

    private String[] str(String s) {
        return new String[]{s};
    }

    public void setControleInsert(int controleInsert) {
        this.controleInsert = controleInsert;
    }
}

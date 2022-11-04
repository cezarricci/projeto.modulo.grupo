package application;

import entities.Cliente;
import entities.ContaNova;
import entities.ContasCliente;

import java.util.ArrayList;
import java.util.List;

public class GestaoClientesContas {
    public static List<Cliente> baseClientes = new ArrayList<Cliente>();
    public List<ContasCliente> baseContasCliente = new ArrayList<ContasCliente>();
    public List<ContaNova> baseContas = new ArrayList<ContaNova>();

    private Integer idContaCorrenteMax;

    public Integer idContaCorrenteMax(){ return idContaCorrenteMax;}

    private Integer idContaPoupancaMax;

    public Integer idContaPoupancaMax(){ return idContaPoupancaMax;}

    private Integer idContaInvestimentoMax;

    public Integer idContaInvestimentoMax(){ return idContaInvestimentoMax;}

    public void setIdContaCorrenteMax(Integer idContaCorrenteMax) {
        this.idContaCorrenteMax = idContaCorrenteMax;
    }

    public void setIdContaPoupancaMax(Integer idContaPoupancaMax) {
        this.idContaPoupancaMax = idContaPoupancaMax;
    }

    public void setIdContaInvestimentoMax(Integer idContaInvestimentoMax) {
        this.idContaInvestimentoMax = idContaInvestimentoMax;
    }

    public boolean criarCliente(String idCliente, String nomeCliente, String tipoPessoa) {
        Cliente novoCliente = new Cliente(idCliente, nomeCliente, tipoPessoa);
        baseClientes.add(novoCliente);
        return true;
    }

    public boolean validaIdCliente(String idCliente, String nomeCliente, String tipoPessoa) {
        boolean valida = false;
        Cliente cliente = new Cliente(idCliente, nomeCliente, tipoPessoa);
        for (Cliente c : baseClientes) {
            if (idCliente.equals(c.getIdCliente().toString())) {
                valida = true;
            }
        }
        return valida;
    }

    public void validaContasCliente(String IDCliente, Integer IDContaCorrente, Integer IDContaPoupanca, Integer IDContaInvestimento) {
        ContasCliente contasCliente = new ContasCliente(IDCliente, IDContaCorrente, IDContaPoupanca, IDContaInvestimento);
        for (ContasCliente c : baseContasCliente) {
            if (IDCliente.equals(c.getIDCliente().toString())) {
                Integer idContaCorrente = c.getIDContaCorrente();
                Integer idContaPoupanca = c.getIDContaPoupanca();
                Integer idContaInvestimento = c.getIDContaInvestimento();
            }
        }
    }
    public boolean criarConta(Integer idConta, String idCliente, String tipoConta) {
        ContaNova novaConta = new ContaNova(idConta, idCliente, tipoConta);
        baseContas.add(novaConta);
        return true;
    }

    public boolean criarNovoCadastro(String idCliente, Integer idContaCorrente, Integer idContaPoupanca, Integer
            idContaInvestimento) {
        ContasCliente novoCadastro = new ContasCliente(idCliente, idContaCorrente, idContaPoupanca, idContaInvestimento);
        baseContasCliente.add(novoCadastro);
        return true;
    }

    public void maxIdsContas() {
        Integer idContaCorrenteAtual = 0;
        Integer idContaPoupancaAtual = 0;
        Integer idContaInvestimentoAtual = 0;
        Integer idContaCorrenteAnterior = 0;
        Integer idContaPoupancaAnterior = 0;
        Integer idContaInvestimentoAnterior = 0;

        setIdContaCorrenteMax(0);
        setIdContaPoupancaMax(0);
        setIdContaInvestimentoMax(0);

        for (ContasCliente c : baseContasCliente) {
            idContaCorrenteAnterior = idContaCorrenteAtual;
            idContaPoupancaAnterior = idContaPoupancaAtual;
            idContaInvestimentoAnterior = idContaInvestimentoAtual;
            idContaCorrenteAtual = c.getIDContaCorrente();
            idContaPoupancaAtual = c.getIDContaPoupanca();
            idContaInvestimentoAtual = c.getIDContaInvestimento();
            if (idContaCorrenteAtual >= idContaCorrenteAnterior) {
                setIdContaCorrenteMax(idContaCorrenteAtual);
            } else {
                setIdContaCorrenteMax(idContaCorrenteAnterior);
            }
            if (idContaPoupancaAtual >= idContaPoupancaAnterior) {
                setIdContaPoupancaMax(idContaPoupancaAtual);
            } else {
                setIdContaPoupancaMax(idContaPoupancaAnterior);
            }
            if (idContaInvestimentoAtual >= idContaInvestimentoAnterior) {
                setIdContaInvestimentoMax(idContaInvestimentoAtual);
            } else {
                setIdContaInvestimentoMax(idContaInvestimentoAnterior);

            }
        }
    }
}

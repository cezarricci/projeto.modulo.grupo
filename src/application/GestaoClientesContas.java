package application;

import entities.Cliente;
import entities.ContaNova;
import entities.ContasCliente;

import java.util.ArrayList;
import java.util.List;

public class GestaoClientesContas {
    List <Cliente> baseClientes = new ArrayList<Cliente>();
    List <ContasCliente> baseContasCliente = new ArrayList<ContasCliente>();

    List <ContaNova> baseContas = new ArrayList<ContaNova>();

    public boolean criarCliente (String idCliente, String nomeCliente, String tipoPessoa){
        Cliente novoCliente = new Cliente(idCliente, nomeCliente, tipoPessoa);
        baseClientes.add(novoCliente);
        return true;
    }

    public boolean criarConta(Integer idConta, String idCliente, String tipoConta){
        ContaNova novaConta = new ContaNova(idConta, idCliente, tipoConta);
        baseContas.add(novaConta);
        return true;
    }

    public boolean criarNovoCadastro(String idCliente, Integer idContaCorrente, Integer idContaPoupanca, Integer idContaInvestimento){
        ContasCliente novoCadastro = new ContasCliente(idCliente, idContaCorrente, idContaPoupanca, idContaInvestimento);
        baseContasCliente.add(novoCadastro);
        return true;
    }
}

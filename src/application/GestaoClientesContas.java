package application;

import entities.Cliente;
import entities.ContaNova;
import entities.ContasCliente;

import java.util.ArrayList;
import java.util.List;

public class GestaoClientesContas {
    List <Cliente> BaseClientes = new ArrayList<Cliente>();
    List <ContasCliente> BaseContasCliente = new ArrayList<ContasCliente>();

    public Cliente criarCliente (String idCliente, String nomeCliente, String tipoPessoa){
        Cliente novoCliente = new Cliente(idCliente, nomeCliente, tipoPessoa);
        return novoCliente;
    }

    public ContaNova criarConta(Integer idConta, String idCliente, String tipoConta){
        ContaNova novaConta = new ContaNova(idConta, idCliente, tipoConta);
        return novaConta;
    }
}

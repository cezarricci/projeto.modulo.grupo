package application;

import entities.Conta;
import entities.SaldoConta;
import entities.enums.TipoConta;
import entities.enums.TipoContaJuridica;
import entities.enums.TipoPessoa;

import java.util.Scanner;

public class CriadorConta {

    Scanner sc = new Scanner(System.in);

    public void criadorConta() {

        int i = 0;
        int j = 0;

        System.out.println("Digite o tipo da pessoa: ");
        for (TipoPessoa tipoPessoa : TipoPessoa.values()) {
            System.out.println(i + " - " + tipoPessoa);
            i++;
        }
        int tipoPessoaIn = sc.nextInt();

        String tipoPessoaIn2 = null;
        if (tipoPessoaIn >= i) {
            System.out.println("Valor de Tipo Pessoa Inválido");
        } else {
            TipoPessoa[] tipoPessoaIn1 = TipoPessoa.values();
            tipoPessoaIn2 = String.valueOf(tipoPessoaIn1[tipoPessoaIn]);
        }

        System.out.println("Digite o nome do responsavel: ");
        String nome = sc.next();

        System.out.println("Digite o tipo da conta desejado: ");
        if (tipoPessoaIn2.equals(TipoPessoa.PESSOA_FISICA.toString())) {
            for (
                    TipoConta tipoConta : TipoConta.values()) {
                System.out.println(j + " - " + tipoConta);
                j++;
            }
        } else {
            for (
                    TipoContaJuridica tipoContaJuridica : TipoContaJuridica.values()) {
                System.out.println(j + " - " + tipoContaJuridica);
                j++;
            }
        }

        String tipoContaIn2 = null;
        int tipoContaIn = sc.nextInt();
        if (tipoContaIn >= j) {
            System.out.println("Valor de Tipo Conta Inválido");
        } else if(tipoPessoaIn2.equals(TipoPessoa.PESSOA_FISICA.toString())) {
            TipoConta[] tipoContaIn1 = TipoConta.values();
            tipoContaIn2 = String.valueOf(tipoContaIn1[tipoContaIn]);
        }else{
            TipoContaJuridica[] tipoContaIn1 = TipoContaJuridica.values();
            tipoContaIn2 = String.valueOf(tipoContaIn1[tipoContaIn]);
        }

        System.out.println("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        SaldoConta saldoConta = new SaldoConta();
        saldoConta.setSaldo(saldoInicial);

        Conta conta = new Conta(nome,"000-x",saldoConta.getSaldo(),tipoPessoaIn2,tipoContaIn2);
        conta.addConta(0,conta.regCompleto());
        int x = conta.getControleInsert();
        System.out.println("Retorno"+x);

        //PRECISA TERMINAR DE TRATAR E CRIAR FUNCAO PARA REALIZAR O INSERT NO ARRAY LIST.
        //A IDEIA EH TRATAR O REGISTRO CONCATENADO E GERAR AS INFORMAÇÕES GUARDANDO A REFERENCIA DE ENTRADA.
    }

/*
    System.out.println("regCompleto: " + conta.regCompleto());
        conta.addConta(0, conta.regCompleto());
        System.out.println("Arraylist: " + conta.getConta());
    //ira inserir o registro no arraylist

 */
    public static void InseriConta(){

    }

}

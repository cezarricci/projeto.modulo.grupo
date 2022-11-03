package application;

import entities.enums.TipoConta;
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

        if (tipoPessoaIn >= i) {
            System.out.println("Valor de Tipo Pessoa Inválido");
        } else {
            TipoPessoa[] tipoPessoaIn1 = TipoPessoa.values();
            String tipoPessoaIn2 = String.valueOf(tipoPessoaIn1[tipoPessoaIn]);
        }

        System.out.println("Digite o nome do responsavel: ");
        String nome = sc.next();

        System.out.println("Digite o tipo da conta desejado: ");
        for (
                TipoConta tipoConta : TipoConta.values()) {
            System.out.println(j + " - " + tipoConta);
            j++;
        }
        int tipoContaIn = sc.nextInt();

        if (tipoContaIn >= j) {
            System.out.println("Valor de Tipo Conta Inválido");
        } else {
            TipoConta[] tipoContaIn1 = TipoConta.values();
            String tipoContaIn2 = String.valueOf(tipoContaIn1[tipoContaIn]);
        }

    }

}

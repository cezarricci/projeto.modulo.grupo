package application;

import entities.Conta;
import entities.enums.TipoConta;
import entities.enums.TipoPessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CriadorConta criadorConta = new CriadorConta();
        criadorConta.criadorConta();


        /*

        ArrayList<Conta> listaPessoa = new ArrayList<Pessoa>();

        for(int i=0; i < 10; i++){
            Pessoa pessoa = new Pessoa();
            System.out.println("\nDigite o nome:");
            pessoa.nome = s.next();
            System.out.println("\nDigite a idade:");
            pessoa.idade = s.nextInt();
            listaPessoa.add(pessoa);

        }
        System.out.println(listaPessoa.get(7));

*/

    }
}

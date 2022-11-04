package application;

import java.util.Scanner;

public class OperacoesConta {

    Scanner scanner = new Scanner(System.in);



    public void ListarOperacoes(){

        System.out.println("Digite o CPF/CNPJ do Cliente:");
        String id_cliente = scanner.next();

        System.out.println("Digite o tipo de pessoa(F/J):");
        String tp_pessoa = scanner.next();

         switch (tp_pessoa){
             case "F":
             case "f":
             case "J":
             case "j":
                 System.out.println(" Selecione a operacao que deseja realizar: ");
                 System.out.println("1- Sacar");
                 System.out.println("2- Depositar");
                 System.out.println("3- Transferir");
                 if (tp_pessoa == "J") {
                     System.out.println("4- Investir");
                 }

        }

        Integer opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("1- Sacar");
            case 2:
                System.out.println("2- Depositar");
            case 3:
                System.out.println("3- Transferir");
            case 4:
                System.out.println("4- Investir");
            default:
                System.out.println("Retornando ao menu inicial");
        }
    }

}

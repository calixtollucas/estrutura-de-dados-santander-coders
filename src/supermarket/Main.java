package supermarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Supermarket supermarket = new SupermarketArray(3);
        Scanner in = new Scanner(System.in);


        int opcao;
        do{
            System.out.println("###############################");
            System.out.println("SISTEMA DE LISTA DE COMPRAS");
            System.out.println("1 - adicionar item");
            System.out.println("2 - imprimir lista");
            System.out.println("3 - remover");
            System.out.println("4 - sair");
            System.out.println("Insira a opção abaixo: ");
            opcao = Integer.parseInt(in.next());

            switch (opcao){
                case 1:
                    System.out.println("Insira o item que deseja adicionar");
                    String item = in.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Insira o index do item que deseja remover");
                    int index = Integer.parseInt(in.next());
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        } while (opcao != 4);

        in.close();
    }
}

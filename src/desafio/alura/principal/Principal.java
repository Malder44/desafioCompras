package desafio.alura.principal;

import desafio.alura.compras.MenuCompras;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MenuCompras menu;
        int digito;
        String nomeProduto;
        double valorProduto;

        System.out.println("Digite o limite do cartão:");
        menu = new MenuCompras(teclado.nextDouble());
        do {
            System.out.println("Digite a descrição da compra: ");
            nomeProduto = teclado.nextLine();
            System.out.println("Digite o valor da compra: ");
            valorProduto = teclado.nextDouble();
            menu.compra(nomeProduto, valorProduto);
            System.out.println("Digite 0 para sair ou 1 para continuar");
            digito = teclado.nextInt();
        } while(menu.verificaPodeComprar() && digito == 1);
        menu.exibeCompras();
    }
}

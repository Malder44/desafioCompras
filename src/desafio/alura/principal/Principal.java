package desafio.alura.principal;

import desafio.alura.compras.MenuCompras;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MenuCompras menu;
        int digito = 1;
        String nomeProduto;
        double valorProduto;

        System.out.println("Digite o limite do cartão:");
        menu = new MenuCompras(teclado.nextDouble());
        while(menu.verificaLimite() && digito == 1) {
            teclado.nextLine(); //Captura do caractere "enter"
            System.out.println("Digite a descrição da compra: ");
            nomeProduto = teclado.nextLine();
            System.out.println("Digite o valor da compra: ");
            valorProduto = teclado.nextDouble();
            menu.compra(nomeProduto, valorProduto);
            if(menu.verificaLimite()) {
                System.out.println("Digite 0 para sair ou 1 para continuar");
                digito = teclado.nextInt();
            } else {
                System.out.println("Limite esgotado!\n");
            }
        }
        menu.exibeCompras();
    }
}

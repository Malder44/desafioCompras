package desafio.alura.compras;

import java.util.ArrayList;
import java.util.List;

public class MenuCompras {
    private CartaoCredito cartao;
    private List<Produto> listaDeCompras;

    public MenuCompras(double limite) {
        cartao = new CartaoCredito(limite);
        listaDeCompras = new ArrayList<>();
    }

    public void compra(String nome, double valor) {
        if(valor <= cartao.getLimite()) {
            listaDeCompras.add(new Produto(nome, valor));
            cartao.compra(valor);
            System.out.println("Compra realizada!");
        } else {
            System.out.println("Saldo insuficiente!");
            exibeCompras();
        }
    }

    public void exibeCompras() {
        System.out.println("COMPRAS REALIZADAS:");
        System.out.println("\n");
        for(Produto produtos : listaDeCompras) {
            System.out.println(produtos.getNome() + " - " + produtos.getValor());
        }
        System.out.println("\n");
        System.out.println("Saldo do cartão: " + cartao.getLimite());
    }

    public boolean verificaPodeComprar() {
        return cartao.getLimite() == 0;
    }
}

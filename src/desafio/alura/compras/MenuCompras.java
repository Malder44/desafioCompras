package desafio.alura.compras;

import java.util.ArrayList;
import java.util.Collections;
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
        }
    }

    public void exibeCompras() {
        if(listaDeCompras.size() > 0) {
            ProdutoNomeComparator comparador = new ProdutoNomeComparator();
            System.out.println("COMPRAS REALIZADAS:");
            System.out.println("\n");
            Collections.sort(listaDeCompras, comparador);
            Collections.sort(listaDeCompras);
            for(Produto produto : listaDeCompras) {
                System.out.println(produto.getNome() + " - " + produto.getValor());
            }
            System.out.println("\n");
            System.out.println("Saldo do cartão: " + cartao.getLimite());
        } else {
            System.out.println("\nNenhuma compra foi realizada.");
        }
    }

    public boolean verificaLimite() {
        return cartao.getLimite() != 0;
    }
}

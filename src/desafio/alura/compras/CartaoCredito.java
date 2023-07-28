package desafio.alura.compras;

public class CartaoCredito {
    private double limite;

    public CartaoCredito(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void compra(double valor) {
        limite -= valor;
    }
}

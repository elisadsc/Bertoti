public class PagamentoDinheiro implements FormaPagamento {
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em dinheiro no valor de R$" + valor);
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
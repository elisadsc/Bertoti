public class PagamentoCredito implements FormaPagamento {
    private double valor;

    public PagamentoCredito(double valor) {
        this.valor = valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito no valor de R$" + valor);
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}

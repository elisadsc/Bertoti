public class PagamentoDebito implements FormaPagamento {
    private double valor;

    public PagamentoDebito(double valor) {
        this.valor = valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de débito no valor de R$" + valor);
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
public class PagamentoCredito implements EstrategiaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito no valor de R$" + valor);
    }
}

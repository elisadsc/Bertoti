public class PagamentoDebito implements EstrategiaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de débito no valor de R$" + valor);
    }
}
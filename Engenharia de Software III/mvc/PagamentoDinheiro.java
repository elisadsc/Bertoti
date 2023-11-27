public class PagamentoDinheiro implements EstrategiaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em dinheiro no valor de R$" + valor);
    }
}
public class PagamentoView implements Observer {
    private PagamentoController controller;

    public PagamentoView(PagamentoController controller) {
        this.controller = controller;
        controller.addObserver(this);
    }

    @Override
    public void update(double valor) {
        System.out.println("View: Pagamento realizado no valor de R$" + valor);
    }

    public void realizarPagamento(double valor) {
        controller.realizarPagamento(valor);
    }
}

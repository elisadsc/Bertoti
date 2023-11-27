class FacadePagamento {
    private PagamentoCredito pagamentoCredito;
    private PagamentoDebito pagamentoDebito;
    private PagamentoDinheiro pagamentoDinheiro;

    public FacadePagamento() {
        this.pagamentoCredito = new PagamentoCredito();
        this.pagamentoDebito = new PagamentoDebito();
        this.pagamentoDinheiro = new PagamentoDinheiro();
    }

    public void realizarPagamentoCredito(double valor) {
        pagamentoCredito.realizarPagamentoCredito(valor);
    }

    public void realizarPagamentoDebito(double valor) {
        pagamentoDebito.realizarPagamentoDebito(valor);
    }

    public void realizarPagamentoDinheiro(double valor) {
        pagamentoDinheiro.realizarPagamentoDinheiro(valor);
    }
}


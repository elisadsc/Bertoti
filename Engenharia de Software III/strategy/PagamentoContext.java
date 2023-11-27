public class PagamentoContext {
    private EstrategiaPagamento estrategia;

    public PagamentoContext(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        estrategia.realizarPagamento(valor);
    }

    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }
}
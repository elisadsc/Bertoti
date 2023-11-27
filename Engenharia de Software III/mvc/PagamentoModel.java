public class PagamentoModel {
    private EstrategiaPagamento estrategia;

    public PagamentoModel(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        estrategia.realizarPagamento(valor);
    }

    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }
}
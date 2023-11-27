public class CompraComposite implements FormaPagamento {
    private List<FormaPagamento> formasPagamento;
    private double valorTotal;

    public CompraComposite() {
        this.formasPagamento = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento total da compra: R$" + valor);
    }

    @Override
    public double getValor() {
        return this.valorTotal;
    }

    public void adicionarFormaPagamento(FormaPagamento formaPagamento) {
        formasPagamento.add(formaPagamento);
        this.valorTotal += formaPagamento.getValor();
    }

    public void removerFormaPagamento(FormaPagamento formaPagamento) {
        formasPagamento.remove(formaPagamento);
        this.valorTotal -= formaPagamento.getValor();
    }

    public List<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }
}
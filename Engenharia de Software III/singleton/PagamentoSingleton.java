public class PagamentoSingleton {

    private static PagamentoSingleton instancia;

    private PagamentoSingleton() {
    }

    public static PagamentoSingleton getInstance() {
        if (instancia == null) {
            instancia = new PagamentoSingleton();
        }
        return instancia;
    }

    public void pagarCredito(double valor) {
        System.out.println("Pagamento com cartão de crédito no valor de: " + valor);
    }

    public void pagarDebito(double valor) {
        System.out.println("Pagamento com cartão de débito no valor de: " + valor);
    }

    public void pagarDinheiro(double valor) {
        System.out.println("Pagamento em dinheiro no valor de: " + valor);
    }

}

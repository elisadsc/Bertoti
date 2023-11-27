public class Contabilidade implements Observer {
    @Override
    public void update(double valor) {
        System.out.println("Registrando pagamento na contabilidade. Valor: R$" + valor);
    }
}
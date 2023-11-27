public class Estoque implements Observer {
    @Override
    public void update(double valor) {
        System.out.println("Atualizando o estoque após o pagamento. Valor: R$" + valor);
    }
}
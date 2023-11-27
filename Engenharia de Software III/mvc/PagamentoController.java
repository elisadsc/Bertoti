public class PagamentoController {
    private PagamentoModel model;
    private List<Observer> observers;

    public PagamentoController(PagamentoModel model) {
        this.model = model;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void realizarPagamento(double valor) {
        model.realizarPagamento(valor);
        notifyObservers(valor);
    }

    private void notifyObservers(double valor) {
        for (Observer observer : observers) {
            observer.update(valor);
        }
    }
}
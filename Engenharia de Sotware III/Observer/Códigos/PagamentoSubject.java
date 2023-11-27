import java.util.ArrayList;
import java.util.List;

public class PagamentoSubject {
    private List<Observer> observers;
    private double valor;

    public PagamentoSubject() {
        this.observers = new ArrayList<>();
        this.valor = 0.0;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
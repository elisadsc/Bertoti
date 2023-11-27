public void removerObserver(Observer observer) {
    this.observers.remove(observer);
}

public void realizarPagamento(double valor) {
    this.valor = valor;
    notifyObservers();
}

private void notifyObservers() {
    for (Observer observer : observers) {
        observer.update(valor);
    }
}
}
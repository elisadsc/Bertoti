import java.util.ArrayList;
import java.util.List;

public interface FormaPagamento {
    void realizarPagamento(double valor);
    double getValor();
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Conta;
import com.example.TransferenciaEntreContas;

public class ExceptionsTest {
    
    // Exception funciona como uma forma de tratar erros que podem ocorrer durante a execução de um programa
    @Test 
    public void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("654321", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
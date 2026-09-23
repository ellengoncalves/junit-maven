import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import com.example.Pessoa;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    
    @Test 
    void validaLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};

        assertNotEquals(primeiroLancamento, segundoLancamento); // validação do resultado obtido com o resultado esperado
    }

    @Test 
    void validarSeObjetivoEstaNulo() {
       Pessoa pessoa = null;
       
       assertNull(pessoa);

       pessoa = new Pessoa("Luciano", LocalDateTime.now());

       assertNotNull(pessoa);
    }

    @Test 
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
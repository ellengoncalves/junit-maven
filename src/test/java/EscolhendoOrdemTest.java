import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Escolhendo a ordem de execução dos testes com base na anotação @Order
//@TestMethodOrder(MethodOrderer.MethodName.class) // Escolhendo a ordem de execução dos testes com base no nome do método
//@TestMethodOrder(MethodOrderer.Random.class) // Escolhendo a ordem de execução dos testes de forma aleatória
@TestMethodOrder (MethodOrderer.DisplayName.class) // Escolhendo a ordem de execução dos testes com base no nome do teste
public class EscolhendoOrdemTest {
    
    //@Order(4)
    @DisplayName("A - Valida fluxo A")
    @Test 
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    //@Order(3)
    @DisplayName("B - Valida fluxo B")
    @Test 
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    //@Order(2)
    @DisplayName("C - Valida fluxo C")
    @Test 
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    //@Order(1)
    @DisplayName("D - Valida fluxo D")
    @Test 
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}

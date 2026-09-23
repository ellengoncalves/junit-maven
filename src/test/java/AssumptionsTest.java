import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    //Assumptions são usadas para verificar se uma condição/hipótese é verdadeira antes de executar um teste. 
    //É assumida uma condição, se a condição não for atendida, o teste será ignorado.
    @Test 
    void validarAlgoSomenteNoUsuarioEllen() {
        Assumptions.assumeTrue("Ellen".equals(System.getenv("USER"))); // usuário do sistema operacional, se for diferente de Ellen, o teste será ignorado.
        Assertions.assertEquals(10, 5 + 5); // esse bloco só será executado se a suposição for verdadeira, caso contrário, o teste será ignorado.
    }

}

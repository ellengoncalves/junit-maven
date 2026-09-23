import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
//import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
//import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
//import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    
    // Condições são usadas para executar ou ignorar testes com base em certas condições, como sistema operacional, versão do Java, variáveis de ambiente, etc.
    @Test 
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "Ellen") // se a variável de ambiente USER for igual a Ellen, o teste será executado, caso contrário, será ignorado.
    //@EnabledOnOs(OS.WINDOWS) // se o sistema operacional for Windows, o teste será executado, caso contrário, será ignorado.
    @EnabledForJreRange(min = JRE.JAVA_17, max = JRE.JAVA_18) // se a versão do Java for entre 11 e 17, o teste será executado, caso contrário, será ignorado.
    void validarAlgoSomenteNoUsuarioEllen() {
        Assertions.assertEquals(10, 5 + 5); 
    }
}
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Pessoa;

public class PessoaTest {
    
    @Test // annotation @Test indica que este método é um caso de teste
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0)); // criação de um cenário de teste
        Assertions.assertEquals(26, jessica.getIdade()); // validação do resultado obtido com o resultado esperado (26 anos)
    }

    @Test 
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade()); // resultado esperado: true

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade()); // resultado esperado: false
    }
}
import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.BancoDeDados;
import com.example.Pessoa;

public class ConsultarDadosDePessoaTest {
    
    // AfterAll e BeforeAll são métodos estáticos, ou seja, não dependem de uma instância da classe para serem executados. Eles são executados uma vez antes e depois de todos os testes na classe de teste, respectivamente.
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    } 

    // BeforeEach e AfterEach são métodos de instância, ou seja, eles dependem de uma instância da classe para serem executados. Eles são executados antes e depois de cada teste na classe de teste, respectivamente.
    @BeforeEach 
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000,1, 1, 13, 0, 0)));
    }

    // quando termina algo, esse objeto é removido do banco de dados, para não poluir o banco de dados com dados de teste
    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000,1, 1, 13, 0, 0)));
    }

    @Test 
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test 
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll 
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

}
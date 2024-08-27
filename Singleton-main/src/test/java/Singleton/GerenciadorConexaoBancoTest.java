package Singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenciadorConexaoBancoTest {

    @Test
    public void deveConectarComSucesso() {
        GerenciadorConexaoBanco gerenciador = GerenciadorConexaoBanco.getInstance();

        assertDoesNotThrow(() -> gerenciador.conectar(), "A conexão ao banco de dados deveria ocorrer sem exceções.");
    }

    @Test
    public void deveDesconectarComSucesso() {
        GerenciadorConexaoBanco gerenciador = GerenciadorConexaoBanco.getInstance();

        assertDoesNotThrow(() -> gerenciador.desconectar(), "A desconexão do banco de dados deveria ocorrer sem exceções.");
    }

    @Test
    public void deveRetornarMesmaInstancia() {
        GerenciadorConexaoBanco gerenciador1 = GerenciadorConexaoBanco.getInstance();
        GerenciadorConexaoBanco gerenciador2 = GerenciadorConexaoBanco.getInstance();

        assertSame(gerenciador1, gerenciador2, "As duas referências deveriam apontar para a mesma instância.");
    }
}

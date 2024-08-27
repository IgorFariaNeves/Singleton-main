package Singleton;

class GerenciadorConexaoBanco {

    private static GerenciadorConexaoBanco instanciaUnica;

    // Construtor privado para evitar múltiplas instâncias
    private GerenciadorConexaoBanco() {
        // Configurações iniciais de conexão, como URL, usuário, senha, etc.
    }

    // Método estático para obter a instância única
    public static GerenciadorConexaoBanco getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new GerenciadorConexaoBanco();
        }
        return instanciaUnica;
    }

    // Método para conectar ao banco de dados
    public void conectar() {
        System.out.println("Conectando ao banco de dados...");
        // Código para realizar a conexão
    }

    // Método para desconectar do banco de dados
    public void desconectar() {
        System.out.println("Desconectando do banco de dados...");
        // Código para fechar a conexão
    }
}

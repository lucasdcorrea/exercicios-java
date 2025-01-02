package br.com.hekatepool.hekatepool.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jessi
 */
public class ConexaoMySQL implements Conexao {

    private Connection connection;
    private final String URL = "jdbc:mysql://hekate_db.mysql.dbaas.com.br/hekate_db";
    private final String USER = "hekate_db";
    private final String PASSWORD = "Hekate.310397!";

    @Override
    public Connection obterConexao() throws SQLException {
        // Verifica se a conexão é nula ou inválida
        if (connection == null || !connection.isValid(10000)) {
            // Se for nula ou inválida, cria uma nova conexão
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }

    @Override
    public void fecharConexao() throws SQLException {
        if (connection != null) {
            // Fecha a conexão apenas se estiver aberta
            connection.close();
        }
    }

}

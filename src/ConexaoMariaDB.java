import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMariaDB {

    private static final String URL = "jdbc:mariadb://localhost:3306/banco_marco";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection obterConexao() throws SQLException {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao obter conexão: " + e.getMessage());
            throw e;
        }
        return conexao;
    }
}

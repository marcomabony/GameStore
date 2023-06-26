import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListaGames {
    public static void exibirListaDeJogos() {
        try {
            Connection connection = ConexaoMariaDB.obterConexao();
            String sql = "SELECT * FROM Games";

            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                System.out.println("Lista de jogos:");

                while (resultSet.next()) {
                    int idGame = resultSet.getInt("id_game");
                    String nomeGame = resultSet.getString("nome_game");
                    String generoGame = resultSet.getString("genero_game");
                    int precoGame = resultSet.getInt("preco_game");

                    Game game = new Game(idGame, nomeGame, generoGame, precoGame);
                    System.out.println(game.toString());
                }
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao obter conexão: " + e.getMessage());
        }
    }
}

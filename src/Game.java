import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Game {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/banco_marco";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private int idGame;
    private String nomeGame;
    private String generoGame;
    private int precoGame;

    public Game(int idGame, String nomeGame, String generoGame, int precoGame) {
        this.idGame = idGame;
        this.nomeGame = nomeGame;
        this.generoGame = generoGame;
        this.precoGame = precoGame;
    }
    @Override
    public String toString() {
        return "ID: " + idGame + ", Nome: " + nomeGame + ", Gênero: " + generoGame + ", Preço: " + precoGame;
    }

    public static void inserirDados() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            inserirDados(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void inserirDados(Connection connection) throws SQLException {
        String sql = "INSERT INTO Games (id_game, nome_game, genero_game, preco_game) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserir dados do jogo:");

            System.out.print("ID do jogo: ");
            int idGame = scanner.nextInt();
            statement.setInt(1, idGame);

            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Nome do jogo: ");
            String nomeGame = scanner.nextLine();
            statement.setString(2, nomeGame);

            System.out.print("Gênero do jogo: ");
            String generoGame = scanner.nextLine();
            statement.setString(3, generoGame);

            System.out.print("Preço do jogo: ");
            int precoGame = scanner.nextInt();
            statement.setInt(4, precoGame);

            statement.executeUpdate();
        }
    }
}

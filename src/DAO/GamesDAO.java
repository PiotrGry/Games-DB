package DAO;
import model.Game;

import javax.jnlp.IntegrationService;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GamesDAO implements DAO {

    private DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    private Connection connection = null;

    public GamesDAO() {
        connection = databaseConnection.getConnection();
    }

    @Override
    public List<Game> selectALlGames() throws SQLException {
        ArrayList<Game> games = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Games;");
        ResultSet queryResult = preparedStatement.executeQuery();
        while(queryResult.next()){
            int gameId = Integer.parseInt(queryResult.getString("id"));
            String gameTitle = queryResult.getString("Title");
            int gamesSoldCopies = Integer.parseInt(queryResult.getString(
                                    "Total_copies_sold"));
            int gameYearRelase = Integer.parseInt(queryResult.getString("Relase_year"));
            String gameGenre = queryResult.getString("Genre");
            String gamePublisher = queryResult.getString("Publisher");

            Game game = new Game(gameId, gameTitle, gamesSoldCopies, gameYearRelase, gameGenre, gamePublisher );
            games.add(game);
        }
        return games;
    }


    @Override
    public List<Game> sortByYear(int year) {
        return null;
    }

    @Override
    public List<Game> getGenres() {
        return null;
    }

    @Override
    public List<Game> sortByTitle() {
        return null;
    }

    @Override
    public List<Game> getIdByTitle(String title) {
        return null;
    }

    @Override
    public int insertGame(Game game) throws SQLException {
       PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Games " +
                                                "(Title, Total_copies_sold, Relase_year, Genre, Publisher)" +
                                                    "VALUES(?,?,?,?,?)");

       preparedStatement.setString(1, game.getGameTitle());
       preparedStatement.setInt(2, game.getNumbersOfSoldCopies());
       preparedStatement.setInt(3, game.getRelaseYear());
       preparedStatement.setString(4, game.getGenre());
       preparedStatement.setString(5, game.getPublisher());

       return preparedStatement.executeUpdate();
    }

    @Override
    public int updateGame(Game game) throws SQLException {
        return 0;
    }

    @Override
    public int deleteGame(Game game) throws SQLException {
        return 0;
    }
}



package DAO;

import java.sql.SQLException;
import java.util.List;
import model.Game;

public interface DAO {
    List<Game> selectALlGames() throws SQLException;
    List<Game> sortByYear(int year);
    List<Game> getGenres();
    List<Game> sortByTitle();
    List<Game> getIdByTitle(String title);
    int insertGame(Game game) throws SQLException;
    int updateGame(Game game) throws SQLException;
    int deleteGame (Game game) throws SQLException;


}

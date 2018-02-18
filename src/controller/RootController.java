package controller;

import DAO.GamesDAO;
import VIEW.View;
import model.Game;

import java.sql.SQLException;

public class RootController {
    GamesDAO gamesDAO = new GamesDAO();
    View view = new View();
    public void run() {

//      Game valueToInsert = view.getApplicantInput();
//        try {
//            gamesDAO.insertGame(valueToInsert);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
           for(Game game: gamesDAO.selectALlGames()){
               System.out.println(game);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

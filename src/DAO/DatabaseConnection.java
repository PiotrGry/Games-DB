package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private static Connection connection = null;
    private final String DBNAME = "jdbc:sqlite:Database/Games_database.db";

    private DatabaseConnection (){
        getConnectionToDataBase();
    }

    private void getConnectionToDataBase() {
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DBNAME);
        }catch(SQLException| NullPointerException e){
            System.out.println("DB connection problem.");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found.");
        }
    }
    public static DatabaseConnection getInstance(){
        if(instance == null) instance = new DatabaseConnection();
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }
}

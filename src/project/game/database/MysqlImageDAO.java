package project.game.database;

import java.sql.*;

public class MysqlImageDAO implements ImageDAO {

    private Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/CoronaGame?serverTimezone=UTC",
                    "root",
                    "qtj38gve");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public String getImageUrl() {
        //jdbc gets info from database
        String imageURL = "error";
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM urls;";
            //result set is used to get information out of database
            ResultSet rs = statement.executeQuery(sqlQuery);
            while (rs.next()){
                imageURL = rs.getString("url");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("this was found in database: "+imageURL);
        //if success we will get an url else we get error
        return imageURL;
    }
}

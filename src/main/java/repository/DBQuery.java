package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQuery {

    public ResultSet sendSelectQuery(String query) {

        DBConnection dBConnection = new DBConnection();
        Connection connection = dBConnection.connect();

        ResultSet resultSet = null;
        try {
            Statement statement = null;
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }

        dBConnection.disconnect();
        return resultSet;
    }

    public void sendUpdateQuery(String query) {

        DBConnection dBConnection = new DBConnection();
        Connection connection = dBConnection.connect();


        try {
            Statement statement = null;
            statement = connection.createStatement();
            statement.executeUpdate(query);


        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }

        dBConnection.disconnect();

    }


}

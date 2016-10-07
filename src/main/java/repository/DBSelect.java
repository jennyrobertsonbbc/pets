package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelect {

    public ResultSet sendQuery(String query) {

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


}

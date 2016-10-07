package repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by roberj78 on 07/10/2016.
 */
public class DBUpdate {

    public void sendQuery(String query) {

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

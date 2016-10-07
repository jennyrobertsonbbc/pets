package repository;

import domain.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by roberj78 on 06/10/2016.
 */
public class OwnerExtractor {

    public List<Owner> ownerList = new ArrayList<Owner>();


    public List<Owner> extract() {

        DBSelect dBSelect = new DBSelect();

        ResultSet resultSet = dBSelect.sendQuery("SELECT * FROM owners ORDER BY owner_id ASC;");


        try {
            while (resultSet.next()) {

                int owner_id = resultSet.getInt("owner_id");
                String owner_name = resultSet.getString("owner_name");
                int owner_age = resultSet.getInt("owner_age");

                ownerList.add(new Owner(owner_id,owner_name,owner_age));

            }

        } catch (SQLException e) {
            //JDBCTutorialUtilities.printSQLException(e);
        }

//        for ( Owner owner : ownerList) {
//            System.out.println(owner.toString());
//        }
//        System.out.println("\n");

        return ownerList;
    }

}

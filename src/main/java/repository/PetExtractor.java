package repository;

import domain.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by roberj78 on 06/10/2016.
 */
public class PetExtractor {

    public List<Pet> petList = new ArrayList<Pet>();


    public List<Pet> extract(ResultSet resultSet) {


        try {
            while (resultSet.next()) {

                int pet_id = resultSet.getInt("pet_id");
                int owner_id = resultSet.getInt("owner_id");
                String petName = resultSet.getString("pet_name");
                int pet_age = resultSet.getInt("pet_age");
                int pet_hunger = resultSet.getInt("pet_hunger");
                int pet_type_id = resultSet.getInt("pet_type_id");


                switch (pet_type_id) {
                    case 1://guineapig
                        petList.add(new GuineaPig(pet_id, owner_id, petName, pet_age, pet_hunger, pet_type_id));
                        break;
                    case 2://cat
                        petList.add(new Cat(pet_id, owner_id, petName, pet_age, pet_hunger, pet_type_id, 100));
                        break;
                    case 3://pig
                        petList.add(new Pig(pet_id, owner_id, petName, pet_age, pet_hunger, pet_type_id));
                        break;
                    case 4://dog
                        petList.add(new Dog(pet_id, owner_id, petName, pet_age, pet_hunger, pet_type_id, true));
                        break;
                }


            }

        } catch (SQLException e) {
            //JDBCTutorialUtilities.printSQLException(e);
        }

        for (
                Pet pet : petList) {
            System.out.println(pet.toString());
        }
        System.out.println("\n");

        return petList;
    }

}

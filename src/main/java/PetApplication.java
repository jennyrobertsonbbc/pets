import com.sun.javafx.binding.StringFormatter;
import domain.Pet;
import repository.DBQuery;
import repository.PetExtractor;
import workflow.PetFeeder;
import workflow.PetFeederBeef;
import workflow.PetFeederHam;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by roberj78 on 29/09/2016.
 */
public class PetApplication {

    public List<Pet> petList = new ArrayList<Pet>();

    public static void main(String args[]){

        DBQuery DBQuery = new DBQuery();
        PetExtractor petExtractor = new PetExtractor();

        //save pet table as objects
        ResultSet resultSet = DBQuery.sendQuery("SELECT * FROM pets;");
        List<Pet> listOfPets = petExtractor.extract(resultSet);

        //edit some values



        //feeds a pet some ham
        PetFeeder hamFeeder = new PetFeederHam();
        //feeds a pet some beef
        PetFeeder beefFeeder = new PetFeederBeef();


        hamFeeder.feed(listOfPets.get(2), 10);
        listOfPets.get(2).speak(2);


        for(Pet pet : listOfPets){

            String query = String.format("UPDATE pets SET " +
                    "owner_id = '%d'," +
                    "pet_name = '%s'," +
                    "pet_age = '%d'," +
                    "pet_hunger = '%d'," +
                    "pet_type_id  = '%d'" +
                    " WHERE pet_id = '%d';",
                    pet.getOwner_id(), pet.getName(), pet.getAge(), pet.getHunger(), pet.getPet_type_id(),pet.getPet_id()
            );
            System.out.println(query);

            DBQuery.sendQuery(query);

        }




    }
}


package repository;

import domain.Pet;

import java.util.List;

/**
 * Created by roberj78 on 07/10/2016.
 */
public class PetSaver {
    public void save(List<Pet> listOfPets){

        DBUpdate dBUpdate = new DBUpdate();

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
            //System.out.println(query);

            dBUpdate.sendQuery(query);



        }
        System.out.println("List of pets saved to DB");
    }

}

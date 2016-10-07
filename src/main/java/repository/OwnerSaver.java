package repository;

import domain.Owner;
import domain.Pet;

import java.util.List;

/**
 * Created by roberj78 on 07/10/2016.
 */
public class OwnerSaver {
    public void save(List<Owner> listOfOwners){

        DBUpdate dBUpdate = new DBUpdate();

        for(Owner owner : listOfOwners){

            String query = String.format("UPDATE owners SET " +
                            "owner_name = '%s'," +
                            "owner_age = '%d'" +
                            " WHERE owner_id = '%d';",
                    owner.getName(), owner.getAge(), owner.getOwner_ID()
            );
            //System.out.println(query);

            dBUpdate.sendQuery(query);



        }
        System.out.println("List of owners saved to DB");
    }

}

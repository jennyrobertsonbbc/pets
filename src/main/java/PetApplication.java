import domain.Pet;
import domain.Owner;

import repository.*;
import workflow.PetFeeder;
import workflow.PetFeederBeef;
import workflow.PetFeederHam;

import java.util.List;

public class PetApplication {


    public static void main(String args[]) {

        PetRepository petRepository = new PetRepository();
        OwnerRepository ownerRepository = new OwnerRepository();

        //Load from database
        List<Pet> listOfPets = petRepository.load();
        List<Owner> listOfOwners = ownerRepository.load();

        //Edit the pets
        PetFeeder hamFeeder = new PetFeederHam();
        PetFeeder beefFeeder = new PetFeederBeef();

        hamFeeder.feed(listOfPets.get(0), 1);
        //listOfOwners.get(0).setAge(45);

        //save to database
        petRepository.save(listOfPets);
        ownerRepository.save(listOfOwners);


    }
}


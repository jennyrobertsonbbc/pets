import domain.Pet;
import domain.Owner;

import repository.OwnerExtractor;
import repository.OwnerSaver;
import repository.PetExtractor;
import repository.PetSaver;
import workflow.PetFeeder;
import workflow.PetFeederBeef;
import workflow.PetFeederHam;

import java.util.ArrayList;
import java.util.List;

public class PetApplication {


    public static void main(String args[]){

        PetExtractor petExtractor = new PetExtractor();
        OwnerExtractor ownerExtractor = new OwnerExtractor();
        PetSaver petSaver = new PetSaver();
        OwnerSaver ownerSaver = new OwnerSaver();

        //Load in pets from database as a list
        List<Pet> listOfPets = petExtractor.extract();
        List<Owner> listOfOwners = ownerExtractor.extract();

        //Edit the pets
        PetFeeder hamFeeder = new PetFeederHam();
        PetFeeder beefFeeder = new PetFeederBeef();

        hamFeeder.feed(listOfPets.get(0), 1);

        listOfOwners.get(0).setName("Gareth2");

        //Save the pets
        petSaver.save(listOfPets);
        ownerSaver.save(listOfOwners);



    }
}


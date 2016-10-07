package repository;

import domain.Pet;

import java.util.List;


public class PetRepository {

    private PetLoader petLoader = new PetLoader();
    private PetSaver petSaver = new PetSaver();

    public List<Pet> load() {
        //Load in pets from database as a list
        List<Pet> listOfPets = petLoader.extract();
        return listOfPets;

    }

    public void save(List<Pet> listOfPets) {

        petSaver.save(listOfPets);
    }


}

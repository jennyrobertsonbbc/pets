package workflow;


import domain.Pet;

/**
 * Created by roberj78 on 29/09/2016.
 */
public interface PetFeeder {

    public void feed(Pet abstractPet, int amountOfFood);

}

package workflow;

import domain.Pet;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class PetFeederHam implements PetFeeder{
    public void feed(Pet abstractPet, int amountOfFood) {
        System.out.printf("Feeding %s %d slices of ham.\n", abstractPet.getName(), amountOfFood);
        abstractPet.setHunger(abstractPet.getHunger()-amountOfFood);

    }

    public void speak(int numberOfTimes) {

    }
}

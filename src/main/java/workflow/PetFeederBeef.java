package workflow;

import domain.Pet;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class PetFeederBeef implements PetFeeder {
    public void feed(Pet abstractPet, int amountOfFood) {
        System.out.printf("Feeding %s the %s %d slices chunks of beef.\n", abstractPet.getName(), abstractPet.getClass().getSimpleName(), amountOfFood);
        abstractPet.setHunger(abstractPet.getHunger()-amountOfFood * 2);




    }
}

package workflow;

import domain.Pet;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class PetFeederBeef implements PetFeeder {
    public void feed(Pet abstractPet, int amountOfFood) {


        int newHunger = abstractPet.getHunger()+amountOfFood * 2;

        System.out.printf("Feeding %s the %s %d chunks of beef.\n", abstractPet.getName(), abstractPet.getClass().getSimpleName(), amountOfFood);

        if(newHunger >= 0 && newHunger <= 100) {

            abstractPet.setHunger(newHunger);
        }
        else if(newHunger <= 100){
            System.out.printf("%s is too full to eat that!\n", abstractPet.getName());
        }




    }
}

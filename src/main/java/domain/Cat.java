package domain;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class Cat extends AbstractPet {
    private int number_of_whiskers;

    public Cat(int pet_id, int owner_id, String name, int age, int hunger, int pet_type_id, int number_of_whiskers) {
        super(pet_id, owner_id, name, age, hunger, pet_type_id);
        this.number_of_whiskers = number_of_whiskers;
    }

    public void speak(int numberOfTimes){
        for(int i = 0;i < numberOfTimes; i++){
            System.out.println("Meow! ");
        }
        System.out.println("");

    }
}

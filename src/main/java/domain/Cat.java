package domain;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class Cat extends AbstractPet {
    private int number_of_whiskers;

    public Cat(String name, int age, int number_of_whiskers) {
        super(name, age);
        this.number_of_whiskers = number_of_whiskers;
    }

    public void speak(int numberOfTimes){
        for(int i = 0;i < numberOfTimes; i++){
            System.out.println("Meow! ");
        }

    }
}

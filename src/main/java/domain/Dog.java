package domain;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class Dog extends AbstractPet {
    //only we can do it
    private boolean goodDog;

    public Dog(String name, int age, boolean goodDog) {
        super(name, age);
        this.goodDog = goodDog;
    }


    public void speak(int numberOfTimes){
        for(int i = 0;i < numberOfTimes; i++){
            System.out.println("Woof! ");
        }

    }
}

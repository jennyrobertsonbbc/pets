package domain;

/**
 * Created by roberj78 on 30/09/2016.
 */
public class Pig implements Pet{



    //other people do it
    public int getHunger() {
        return 0;
    }

    public void setHunger(int hunger) {

    }

    public String getName() {
        return null;
    }

    public void setName(String name) {

    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {

    }

    public void speak(int numberOfTimes){
        for(int i = 0;i < numberOfTimes; i++){
            System.out.println("Oink! ");
        }

    }
}

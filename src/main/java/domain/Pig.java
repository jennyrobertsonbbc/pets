package domain;

/**
 * Created by roberj78 on 30/09/2016.
 */
public class Pig implements Pet {

    private int pet_id;
    private int owner_id;
    private String name;
    private int age;
    private int hunger;
    private int pet_type_id;

    public Pig(int pet_id, int owner_id, String name, int age, int hunger, int pet_type_id) {
        this.pet_id = pet_id;
        this.owner_id = owner_id;
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.pet_type_id = pet_type_id;
    }

    //other people do it
    public int getHunger() {
        return 100;
    }

    public void setHunger(int hunger) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {

    }

    public void speak(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Oink! ");
        }

    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getPet_type_id() {
        return pet_type_id;
    }

    public void setPet_type_id(int pet_type_id) {
        this.pet_type_id = pet_type_id;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hunger=" + hunger +
                '}';
    }
}

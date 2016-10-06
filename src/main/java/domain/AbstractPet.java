package domain;

/**
 * Created by roberj78 on 29/09/2016.
 */
abstract class AbstractPet implements Pet{
    private int pet_id;
    private int owner_id;
    private String name;
    private int age;
    private int hunger;
    private int pet_type_id;

    public AbstractPet(int pet_id, int owner_id, String name, int age, int hunger, int pet_type_id) {
        this.pet_id = pet_id;
        this.owner_id = owner_id;
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.pet_type_id = pet_type_id;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
        System.out.printf("%s's hunger is now %d.\n\n",this.name,getHunger());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "AbstractPet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hunger=" + hunger +
                '}';
    }
}

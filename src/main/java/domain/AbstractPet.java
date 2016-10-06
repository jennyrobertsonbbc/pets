package domain;

/**
 * Created by roberj78 on 29/09/2016.
 */
abstract class AbstractPet implements Pet{
    private String name;
    private int age;
    private int hunger;

    public AbstractPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = 100;
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




}

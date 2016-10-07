package domain;

import java.util.List;

/**
 * Created by roberj78 on 03/10/2016.
 */
public class Owner {
    private int owner_ID;
    private String name;
    private int age;
    private List<Pet> petsOwned;

    public Owner(int owner_ID, String name, int age) {
        this.owner_ID = owner_ID;
        this.name = name;
        this.age = age;
    }

    public int getOwner_ID() {
        return owner_ID;
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

    public List<Pet> getPetsOwned() {
        return petsOwned;
    }

    public void setPetsOwned(List<Pet> petsOwned) {
        this.petsOwned = petsOwned;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "owner_ID=" + owner_ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", petsOwned=" + petsOwned +
                '}';
    }
}

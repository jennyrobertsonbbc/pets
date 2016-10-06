package domain;

/**
 * Created by roberj78 on 30/09/2016.
 */
public interface Pet {

    public int getHunger();

    public void setHunger(int hunger);

    public String getName();

    public void setName(String name);

    public int getAge();

    public void setAge(int age);
    public int getPet_id();

    public void setPet_id(int pet_id);

    public int getOwner_id();

    public void setOwner_id(int owner_id);

    public int getPet_type_id();

    public void setPet_type_id(int pet_type_id);

    public void speak(int numberOfTimes);
}

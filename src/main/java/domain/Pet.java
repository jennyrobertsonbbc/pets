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

    public void speak(int numberOfTimes);
}

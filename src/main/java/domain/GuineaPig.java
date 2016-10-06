package domain;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class GuineaPig extends AbstractPet {
    public GuineaPig(int pet_id, int owner_id, String name, int age, int hunger, int pet_type_id) {
        super(pet_id, owner_id, name, age, hunger, pet_type_id);
    }

    public void speak(int numberOfTimes){
        for(int i = 0;i < numberOfTimes; i++){
            System.out.println("ee");
        }

    }


}

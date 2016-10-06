import domain.Cat;
import domain.Dog;
import domain.Pet;
import domain.Pig;
import repository.DBConnection;
import workflow.PetFeederBeef;
import workflow.PetFeederHam;
import workflow.PetFeeder;

/**
 * Created by roberj78 on 29/09/2016.
 */
public class PetApplication {
    public static void main(String args[]){

        DBConnection dBConnection = new DBConnection();

        dBConnection.connect();


        Cat whiskers = new Cat("Whiskers",5, 100);
        Dog bob = new Dog("Bob",12, true);
        Pig babe = new Pig();

        //feeds a pet some ham
        PetFeeder hamFeeder = new PetFeederHam();
        //feeds a pet some beef
        PetFeeder beefFeeder = new PetFeederBeef();

        hamFeeder.feed(whiskers, 4);
        whiskers.speak(2);
        beefFeeder.feed(whiskers,1);
        beefFeeder.feed(bob,5);
        bob.speak(10);

        babe.speak(4);



    }
}


package repository;

import domain.Owner;

import java.util.List;

/**
 * Created by roberj78 on 07/10/2016.
 */
public class OwnerRepository implements Repository<Owner>{


    private OwnerExtractor ownerLoader = new OwnerExtractor();
    private OwnerSaver ownerSaver = new OwnerSaver();

    public List<Owner> load() {
        //Load in pets from database as a list
        List<Owner> listOfOwners = ownerLoader.extract();
        return listOfOwners;

    }

    public void save(List<Owner> listOfOwners) {

        ownerSaver.save(listOfOwners);
    }

}

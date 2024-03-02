package Humans;

import Humans.Human;
import Places.AbleToBeSmWh;
import Places.Place;

public class Criminal extends Human implements AbleToBeSmWh {
    public Criminal(String name){
        super(name);
    }
    public void be(Place place){
        System.out.println(getName() + " привезли в " + place);

    }

    @Override
    public String toString() {
        return getName();
    }

}

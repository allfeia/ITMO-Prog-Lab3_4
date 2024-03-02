package Places;

import Places.Place;

public class Police extends Place {
    public Police(String name, boolean isRoom){
        super(name, isRoom);
    }

    @Override
    public String toString() {
        return getName();
    }
}

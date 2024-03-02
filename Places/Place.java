package Places;

public abstract class Place {
    private String name;
    private boolean isRoom;

   public Place(String name, boolean isRoom){
       this.name = name;
       this.isRoom = isRoom;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setIsRoom() {
        return isRoom;
    }

    @Override
    public String toString() {
        return getName();
    }
}

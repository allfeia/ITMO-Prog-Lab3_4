package Places;


public class Roadway extends Place{
    public String stones;
    public Roadway(String name, boolean isRoom, String stones){
        super(name, isRoom);
        this.stones = stones;
    }

    @Override
    public String toString() {
        return "по камням мостовой";
    }
}

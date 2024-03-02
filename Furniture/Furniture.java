package Furniture;

public abstract class Furniture {
    private String name;
    private String standsWhere;
    public Furniture(String name, String standsWhere){
        this.name = name;
        this.standsWhere = standsWhere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandsWhere() {
        return standsWhere;
    }

    public void setStandsWhere(String standsWhere) {
        this.standsWhere = standsWhere;
    }
}

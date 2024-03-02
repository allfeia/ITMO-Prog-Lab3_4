package Furniture;

public class Shtafirka extends Furniture implements Standable, Makeable{
    private String divisions;
    private String movableBar;
    private Rail rail;
    public Shtafirka(String name, String standsWhere, String divisions, String movableBar, Rail rail){
        super(name, standsWhere);
        this.divisions = divisions;
        this.movableBar = movableBar;
        this.rail = rail;
    }

    public String getDivisions() {
        return divisions;
    }

    public void setDivisions(String divisions) {
        this.divisions = divisions;
    }

    public String getMovableBar() {
        return movableBar;
    }

    public void setMovableBar(String movableBar) {
        this.movableBar = movableBar;
    }

    public Rail getRail() {
        return rail;
    }

    public void setRail(Rail rail) {
        this.rail = rail;
    }

    public void make() {
        System.out.println("для измерения роста преступника");

    }
    public void stand() {
        System.out.println(getStandsWhere() + " находился прибор - " + this + getRail() + " " + getDivisions() + " и " + getMovableBar());
    }

    @Override
    public String toString() {
        return getName();
    }

}

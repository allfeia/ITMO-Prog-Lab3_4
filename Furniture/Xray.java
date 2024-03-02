package Furniture;

public class Xray extends Furniture implements Standable, Makeable {
    public Xray(String name, String standsWhere){
        super(name, standsWhere);
    }

    public void stand() {
        System.out.println(getStandsWhere() + " находился " + this);
    }
    public void make(){
        System.out.println("с помощью которого просвечивали арестованных, чтобы проверить не украли ли они ценности");

    }

    @Override
    public String toString() {
        return getName();
    }
}

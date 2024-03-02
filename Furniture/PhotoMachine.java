package Furniture;

public class PhotoMachine extends Furniture implements Standable, Makeable{
    public PhotoMachine(String name, String standsWhere){
        super(name, standsWhere);
    }
    public void stand(){
        System.out.println(getStandsWhere() + " стоял " + this);
    }
    public void make(){
        System.out.println("для изготовления фотокарточек");
    }

    @Override
    public String toString() {
        return getName();
    }
}


package Items;

import Humans.Human;

import java.util.Objects;

public class Clothes {
    private String name;
    public Metal.Buttons buttons;
    public Clothes(String name, Metal.Buttons buttons){
        this.name = name;
        this.buttons = buttons;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void differ(Clothes clothes, Human human1, Human human2) {
        if (this.name == clothes.getName()) {
            System.out.println("у " + human1 + " и " + human2 + " одинаковые " + getName());
        }
        else {
            System.out.println("одежда у " + human1 + " и " + human2 + " разная");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(name, clothes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, buttons);
    }
}

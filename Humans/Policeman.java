package Humans;

import Exceptions.CriminalEscapedException;
import Items.Car;
import Items.Clothes;
import Places.AbleToBeSmWh;
import Places.Place;
import Places.WorkSpace;

import java.util.Objects;

public class Policeman extends Human implements AbleToBeSmWh {
        public Clothes clothes;
        public WorkSpace workSpace;
        public Policeman(String name, Clothes clothes, WorkSpace workSpace) {
            super(name);
            this.clothes = clothes;
            this.workSpace = workSpace;
}
        public void passed(Human human1, Human human2) throws CriminalEscapedException {
            if(human1 == null){
                throw new CriminalEscapedException();
            } else {
                System.out.println(getName() + " сдал " + human1 + " с рук на руки " + human2);
            }
        }
        public void be(Place place){
            System.out.println("служба " + getName() + " протекала в " + place + " поэтому ");
        }

        public void noAnswer(){
            System.out.println(this + " не ответил");
        }
        public void command(){
            System.out.println("и скомандовал");
        }
    public void sit(Car car) {
           class Driver{
               private String dname;
               public Driver(String dname){
                   this.dname = dname;
               }
               public String getDname(){
                   return dname;
               }
               public void setDname(String dname){
                   this.dname = dname;
               }

               @Override
               public String toString() {
                   return getDname();
               }
           }
        System.out.println(getName() + " сел в " + car.getCabin() + " рядом с " + new Driver("шофёр"));
    }



    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policeman policeman = (Policeman) o;
        return Objects.equals(clothes, policeman.clothes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clothes);
    }
}

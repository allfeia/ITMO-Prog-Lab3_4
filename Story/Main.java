package Story;

import Exceptions.BadClothesException;
import Exceptions.CheckPolicemanClothes;
import Exceptions.CriminalEscapedException;
import Humans.*;
import Items.*;
import Places.*;
import Furniture.*;


public class Main {
    public static void main(String[] args) {
        //объекты
        Car car = new Car("reno logan", "кабину");
        Car.Motor motor = car.new Motor("мотор");

        //место
        Roadway roadway = new Roadway("мостовой", true,"камням");
        Police police = new Police("полицейское управление", true);

        //мебель
        Table table = new Table("стол", "Посреди комнаты", new TableLegs(true, true, ShapeLegs.QUADRANGULAR),true, true);
        Cabinet cabinet = new Cabinet("шкафы","все стены","о различных преступниках", true);
        PhotoMachine photoMachine = new PhotoMachine("фотографический аппарат","позади " + table.getName() + " с одной стороны");
        Xray xray = new Xray("рентгеновский аппарат", "с другой стороны");
        Shtafirka shtafirka = new Shtafirka("штафирка", "у дверей", "с делениями", "подвижной планкой", new Rail("рейки",true, true, true));

        //люди
        Criminal criminal = new Criminal("Незнайка");
        Policeman policeman1 = new Policeman("полицейский Фигль", new Clothes("мундир",new Metal.Buttons("пуговицы", ButtonsContrast.SHINE)), new WorkSpace(false, true));
        Policeman policeman2 = new Policeman("полицейский Мигль", new Clothes("мундир",new Metal.Buttons("пуговицы", ButtonsContrast.DIMMED)), new WorkSpace(true, false));

        //история
        policeman1.noAnswer();
        policeman1.sit(car);
        policeman1.command();
        motor.buzzed();
        car.jump(roadway);
        //анонимный класс
        GetTime getTime = new GetTime(){
            public void getTime(){
                System.out.println("и через четверть часа");
            }
        };
        getTime.getTime();
        criminal.be(police);
        //checked
        try {
            policeman1.passed(null, policeman2);
        } catch (CriminalEscapedException e){
            System.out.println(e.getMessage());
        }
        policeman1.clothes.differ(policeman2.clothes, policeman1, policeman2);
        System.out.println(policeman2.getName() + policeman2.workSpace);
        System.out.println(policeman1.getName() + policeman1.workSpace);
        System.out.println("поэтому у " + policeman1.getName() + policeman1.clothes.buttons);
        System.out.println("а у " + policeman2.getName() + policeman2.clothes.buttons);

        cabinet.force();
        cabinet.stored();
        table.stand();
        photoMachine.stand();
        photoMachine.make();
        xray.stand();
        xray.make();
        shtafirka.stand();
        shtafirka.make();


        //unchecked
        Policeman policeman3 = new Policeman("полицейский Василий Иванович", new Clothes("халат", null), new WorkSpace(true, false));
        try{
            CheckPolicemanClothes.check(policeman3.clothes.getName());
        } catch (BadClothesException e){
            System.out.println(e.getMessage());
        }

    }


}
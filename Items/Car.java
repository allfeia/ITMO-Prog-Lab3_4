package Items;

import Places.Roadway;

public class Car {
    private String name;
    private String cabin;

    public Car(String name, String cabin) {
        this.name = name;
        this.cabin = cabin;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public void jump(Roadway roadway) {
        System.out.println(getName() + " запрыгал " + roadway.getName());
    }

    public class Motor {
        private String name;

        public Motor(String name) {
            this.name = name;
        }

        public String getMName() {
            return name;
        }

        public void setMName(String name) {
            this.name = name;
        }

        public void buzzed() {
            System.out.println(getMName() + " загудел");
        }
    }
}
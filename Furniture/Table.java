package Furniture;
public class Table extends Furniture implements Standable {
    public TableLegs tableLegs;
    private boolean isStrong;
    private boolean isOak;

    public Table(String name, String standsWhere, TableLegs tableLegs, boolean isStrong, boolean isOak) {
        super(name, standsWhere);
        this.tableLegs = tableLegs;
        this.isStrong = isStrong;
        this.isOak = isOak;
    }

    public boolean getIsStrong() {
        return isStrong;
    }

    public void setIsStrong(boolean strong) {
        this.isStrong = strong;
    }

    public boolean getIsOak() {
        return this.isOak;
    }

    public void setOak(boolean oak) {
        isOak = oak;
    }

    public void stand() {
        System.out.println(getStandsWhere() + " стоял " + this);
    }

    @Override
    public String toString() {
        String descriptionResult = "";
        if (isStrong) {
            descriptionResult += "крепкий ";
        }
        if (isOak) {
            descriptionResult += "дубовый ";
        }
        return descriptionResult += getName() + tableLegs;
    }
}

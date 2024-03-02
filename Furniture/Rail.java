package Furniture;

public class Rail {
    private String name;
    private boolean isLong;
    private boolean isOnRack;
    private boolean isVertical;

    public Rail(String name, boolean isLong, boolean isOnRack, boolean isVertical) {
        this.name = name;
        this.isLong = isLong;
        this.isOnRack = isOnRack;
        this.isVertical = isVertical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsLong() {
        return isLong;
    }

    public void seIstLong(boolean isLong) {
        this.isLong = isLong;
    }

    public boolean getIsOnRack() {
        return isOnRack;
    }

    public void setIsOnRack(boolean isOnRack) {
        this.isOnRack = isOnRack;
    }

    public boolean getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(boolean isVertical) {
        this.isVertical = isVertical;
    }

    @Override
    public String toString() {
        String railResult = ", состоявший из ";
        if(isLong){
            railResult += "длинной, ";
        }
        if(isOnRack){
            railResult += "установленной на подставке ";
        }
        if(isVertical){
            railResult += "вертикальной ";
        }
        return railResult += getName();
    }
}

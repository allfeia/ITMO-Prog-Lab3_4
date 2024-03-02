package Furniture;

public class Cabinet extends Furniture{
    private String information;
    private boolean isHigh;
    public Cabinet(String name, String standsWhere, String information, boolean isHigh){
        super(name, standsWhere);
        this.information = information;
        this.isHigh = isHigh;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public boolean getIsHigh() {
        return isHigh;
    }

    public void setIsHigh(boolean high) {
        this.isHigh = high;
    }
    public void force(){
        System.out.println(getStandsWhere() + " были заставлены ");
    }

    public void stored(){
        System.out.println(this + ", в которых хранились сведения " + getInformation());
    }

    @Override
    public String toString() {
        String descriptionCabinet = "";
        if(isHigh){
            descriptionCabinet += "высокими ";
        }
        return descriptionCabinet += getName();
    }
}

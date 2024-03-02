package Places;

public class WorkSpace {
    private boolean isClosed;
    private boolean isVentilation;
    public WorkSpace(boolean isClosed, boolean isVentilation){
        this.isClosed = isClosed;
        this.isVentilation = isVentilation;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public boolean getIsVentilation() {
        return isVentilation;
    }

    public void setVentilation(boolean isVentilation) {
        this.isVentilation = isVentilation;
    }

    @Override
    public String toString() {
        String  RoomVentilation = " работает ";
        if (!isClosed){
            RoomVentilation += "на свежем воздухе";
        }
        else {
            switch (Ventilation.BAD) {
                case Ventilation.BAD:
                    RoomVentilation += "в плохо проветриваемом помещении";
                    break;
                case Ventilation.GOOD:
                    RoomVentilation += "в хорошо проветриваемом помещении";
                    break;

            }
        }
        return RoomVentilation;
    }


}




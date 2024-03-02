package Furniture;
    public class TableLegs{
        private boolean isHeavy;
        private boolean isStraight;
        private ShapeLegs shape;
        public TableLegs(boolean isHeavy, boolean isStraight, ShapeLegs shape){
            this.isHeavy = isHeavy;
            this.isStraight = isStraight;
            this.shape = shape;
        }

        public boolean getIsHeavy() {
            return isHeavy;
        }

        public void setHeavy(boolean heavy) {
            isHeavy = heavy;
        }

        public boolean getIsStraight() {
            return isStraight;
        }

        public void setStraight(boolean straight) {
            isStraight = straight;
        }

        public ShapeLegs getShape() {
            return shape;
        }

        public void setShape(ShapeLegs shape) {
            this.shape = shape;
        }

        @Override
        public String toString() {
            String descriptionLegs = " c ";
            if(isHeavy){
                descriptionLegs += "тяжёлыми ";
            }
            if(isStraight){
                descriptionLegs += "прямыми ";
            }
            switch (shape){
                case QUADRANGULAR:
                    descriptionLegs += "четырёхугольными ножками";
                    break;
                case TRAINGULAR:
                    descriptionLegs += "треугольными ножками";
                    break;
                case ROUND:
                    descriptionLegs += "круглыми ножками";
                    break;
            }
                return descriptionLegs;
        }
    }

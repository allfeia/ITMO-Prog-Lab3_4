package Items;

import Items.ButtonsContrast;

public class Metal {

    public static class Buttons {
        private String name;
        private ButtonsContrast difference;

        public Buttons(String name, ButtonsContrast difference) {
            this.name = name;
            this.difference = difference;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ButtonsContrast getDifference() {
            return difference;
        }

        public void setDifference(ButtonsContrast difference) {
            this.difference = difference;
        }

        @Override
        public String toString() {
            String diffResult = " пуговицы на мундире ";
            switch (difference) {
                case SHINE:
                    diffResult += "ярко блестели ";
                    break;
                case DIMMED:
                    diffResult += "потускнели ";
                    break;
            }
            return diffResult;
        }
    }
}

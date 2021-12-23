package additional.sweets.candies;

import additional.sweets.Sweet;

public class Caramel extends Sweet {
    String color;

    public Caramel(int weight, int sugarPercentage, String taste, String color) {
        super(weight, sugarPercentage, taste);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Caramel{" + "color=" + color + " Sugar=" + super.getSugarPercentage() + "}";
    }
}

package additional.sweets.candies;

import additional.sweets.Sweet;

public class Candy extends Sweet {
    String filling;

    public Candy(int weight, int sugarPercentage, String taste, String filling) {
        super(weight, sugarPercentage, taste);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Candy{" + "filling=" + filling + " Sugar=" + super.getSugarPercentage() + "}";
    }
}

package additional.sweets.candies;

import additional.sweets.Sweet;

public class Lollipop extends Sweet {
    boolean onStick;

    public Lollipop(int weight, int sugarPercentage, String taste, boolean onStick) {
        super(weight, sugarPercentage, taste);
        this.onStick = onStick;
    }

    public boolean isOnStick() {
        return onStick;
    }

    public void setOnStick(boolean onStick) {
        this.onStick = onStick;
    }

    @Override
    public String toString() {
        return "Lollipop{" + "onStick=" + onStick + " Sugar=" + super.getSugarPercentage() + "}";
    }
}

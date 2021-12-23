package additional.sweets;

public class Sweet {
    int weight;
    int sugarPercentage;
    String taste;

    public Sweet(int weight, int sugarPercentage, String taste){
        this.weight = weight;
        this.sugarPercentage = sugarPercentage;
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarPercentage() {
        return sugarPercentage;
    }

    public void setSugarPercentage(int sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

}

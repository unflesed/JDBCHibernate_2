package additional.present;

import additional.sweets.Sweet;

import java.util.ArrayList;
import java.util.List;

public class Present {
    List<Sweet> sweets = new ArrayList<>();

    public Present(){

    }

    public int countWeight(){
        return sweets.stream().mapToInt(Sweet::getWeight).sum();
    }
    public List<Sweet> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweet> sweets) {
        this.sweets = sweets;
    }

    @Override
    public String toString() {
        return "Present{" +
                "sweets=" + sweets +
                '}';
    }
}

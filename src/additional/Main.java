package additional;

import additional.present.Present;
import additional.sweets.Sweet;
import additional.sweets.candies.Candy;
import additional.sweets.candies.Caramel;
import additional.sweets.candies.Lollipop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Sweet> list = new ArrayList<>();
        int range1 = 70;
        int range2 = 80;
        Sweet candy1 = new Candy(10,55, "chocolate", "chocolate");
        Sweet candy2 = new Caramel(21,54, "fruit", "red");
        Sweet candy3 = new Lollipop(32,76, "chocolate", true);
        Sweet candy4 = new Candy(43,89, "fruit", "juice");
        Sweet candy5 = new Caramel(67,71, "chocolate", "green");
        Sweet candy6 = new Lollipop(35,50, "fruit", false);
        list.add(candy1);
        list.add(candy2);
        list.add(candy3);
        list.add(candy4);
        list.add(candy5);
        list.add(candy6);
        Present present = new Present();
        present.setSweets(list);
        System.out.println("Вес подарка: " + present.countWeight());
        System.out.println("Сортировка по содержанию сахара:");
        present.getSweets().sort((o1, o2) -> o1.getSugarPercentage() - o2.getSugarPercentage());
        System.out.println(present);
        System.out.println("Входят в диапазон по % сахара: ");
        list = list.stream()
                .filter(s -> s.getSugarPercentage() > range1 && s.getSugarPercentage() < range2)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

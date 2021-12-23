package task_2.DAO;

import additional.sweets.Sweet;
import additional.sweets.candies.Candy;

import java.util.List;

public interface CandyDAO {

    int sumWeight();

    List<Sweet> getALLSorted();

    List<Sweet> getSugarInRange(int range1, int range2);
}

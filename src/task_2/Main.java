package task_2;

import task_2.DAO.CandyDAO;
import task_2.DAO.DAOFactory;
import task_2.DAO.IDAOFactory;

public class Main {
    public static void main(String[] args) {
        IDAOFactory factory = DAOFactory.getInstance();
        CandyDAO candyDAO = factory.getCandyDAO();
        //------------getSumWeight
        System.out.println("Вес подарка: " + candyDAO.sumWeight());

        //------------getALLSorted
        System.out.println("Отсортированные конфеты по содержанию сахара: ");
        System.out.println(candyDAO.getALLSorted());

        //------------getSugarInRange
        System.out.println("Выборка по содержанию сахара в диапазоне: ");
        System.out.println(candyDAO.getSugarInRange(57, 88));
    }
}

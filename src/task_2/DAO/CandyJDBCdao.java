package task_2.DAO;

import additional.sweets.Sweet;
import additional.sweets.candies.Candy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandyJDBCdao implements CandyDAO{
    @Override
    public int sumWeight() {
        int sum = 0;
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = getConnection();
            statement = connection.prepareStatement("SELECT sum(weight) from candies");

            ResultSet rs = statement.executeQuery();

            rs.next();
            sum = rs.getInt(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    @Override
    public List<Sweet> getALLSorted() {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Sweet> candies = new ArrayList<>();

        try{
            connection = getConnection();
            statement = connection.prepareStatement("SELECT * from candies ORDER BY sugar");

            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                int weight = rs.getInt(2);
                int sugar = rs.getInt(3);
                String taste = rs.getString(4);
                String filling = rs.getString(5);

                Sweet candy = new Candy(weight, sugar, taste, filling);
                candies.add(candy);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return candies;
    }

    @Override
    public List<Sweet> getSugarInRange(int range1, int range2) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Sweet> candies = new ArrayList<>();

        try{
            connection = getConnection();
            statement = connection.prepareStatement("SELECT * from candies where sugar > ? and sugar < ?");

            statement.setInt(1, range1);
            statement.setInt(2, range2);

            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                int weight = rs.getInt(2);
                int sugar = rs.getInt(3);
                String taste = rs.getString(4);
                String filling = rs.getString(5);

                Sweet candy = new Candy(weight, sugar, taste, filling);
                candies.add(candy);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return candies;
    }

    private Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/present", "root123", "root123");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

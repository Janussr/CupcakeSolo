package business.persistence;

import business.entities.Bottom;
import business.entities.Topping;
import business.exceptions.UserException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CupcakeMapper {

    private Database database;

    public CupcakeMapper(Database database) {
        this.database = database;
    }

    public List<Topping> getAllToppings() throws UserException {
        List<Topping> toppingsList = new ArrayList<>();
        try (Connection connection = database.connect()) {
            String sql = "SELECT * FROM topping";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("topping_id");
                    String name = resultSet.getString("name");
                    Double price = resultSet.getDouble("price");

                    toppingsList.add(new Topping(id, name, price));
                }
                return toppingsList;
            } catch (SQLException ex) {
                throw new UserException(ex.getMessage());
            }
        } catch (SQLException ex) {
            throw new UserException(ex.getMessage());
        }

    }

    public List<Bottom> getAllBottoms() throws UserException {
        List<Bottom> bottomsList = new ArrayList<>();

        try (Connection connection = database.connect()) {
            String sql = "SELECT * FROM bottom";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("bottom_id");
                    String name = resultSet.getString("name");
                    Double price = resultSet.getDouble("price");

                    bottomsList.add(new Bottom(id, name, price));
                }
                return bottomsList;
            } catch (SQLException ex) {
                throw new UserException(ex.getMessage());
            }
        } catch (SQLException ex) {
            throw new UserException(ex.getMessage());
        }

    }
}

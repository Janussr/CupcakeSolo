package business.services;

import business.entities.Bottom;
import business.exceptions.UserException;
import business.persistence.CupcakeMapper;
import business.persistence.Database;

import java.sql.SQLException;
import java.util.List;

public class CupcakeFacade {

    CupcakeMapper cupcakeMapper;

    public CupcakeFacade(Database database) {
        cupcakeMapper = new CupcakeMapper(database);
    }

    public List<Bottom> getAllBottoms() throws SQLException, UserException {
        return cupcakeMapper.getAllBottoms();
    }
}

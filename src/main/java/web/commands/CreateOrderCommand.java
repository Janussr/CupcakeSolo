package web.commands;

import business.exceptions.UserException;
import business.persistence.CupcakeMapper;
import business.services.CupcakeFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateOrderCommand extends CommandUnprotectedPage {
    CupcakeFacade cupcakeFacade;

    public CreateOrderCommand(String pageToShow) {
        super(pageToShow);
        this.cupcakeFacade = new CupcakeFacade(database);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {


        return pageToShow;
    }
}

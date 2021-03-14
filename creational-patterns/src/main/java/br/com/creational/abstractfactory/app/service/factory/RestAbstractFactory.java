package br.com.creational.abstractfactory.app.service.factory;

import br.com.creational.abstractfactory.app.service.services.CarRestApiService;
import br.com.creational.abstractfactory.app.service.services.CarService;
import br.com.creational.abstractfactory.app.service.services.UserRestApiService;
import br.com.creational.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {
    public UserService getUserService() {
        return new UserRestApiService();
    }

    public CarService getCarService() {
        return new CarRestApiService();
    }
}

package br.com.creational.abstractfactory.app.service.factory;

import br.com.creational.abstractfactory.app.service.services.CarService;
import br.com.creational.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();

    CarService getCarService();
}

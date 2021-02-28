package br.com.creational.factory.apple.factorymethod.factory;

import br.com.creational.factory.apple.factorymethod.model.IPhone;
import br.com.creational.factory.apple.factorymethod.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}

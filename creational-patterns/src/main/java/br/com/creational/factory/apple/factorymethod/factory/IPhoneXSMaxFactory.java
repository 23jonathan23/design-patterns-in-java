package br.com.creational.factory.apple.factorymethod.factory;

import br.com.creational.factory.apple.factorymethod.model.IPhone;
import br.com.creational.factory.apple.factorymethod.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}

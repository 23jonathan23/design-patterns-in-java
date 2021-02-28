package br.com.cod3r.factory.apple.factorymethod.factory;

import br.com.cod3r.factory.apple.factorymethod.model.IPhone;
import br.com.cod3r.factory.apple.factorymethod.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new IPhone11();
    }
}
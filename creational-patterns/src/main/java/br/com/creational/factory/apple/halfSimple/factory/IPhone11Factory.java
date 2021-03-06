package br.com.creational.factory.apple.halfSimple.factory;

import br.com.creational.factory.apple.halfSimple.model.IPhone11Pro;
import br.com.creational.factory.apple.halfSimple.model.IPhone;
import br.com.creational.factory.apple.halfSimple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    public IPhone createIPhone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11();
        } else if ("highEnd".equals(level)) {
            return new IPhone11Pro();
        } else
            return null;
    }
}
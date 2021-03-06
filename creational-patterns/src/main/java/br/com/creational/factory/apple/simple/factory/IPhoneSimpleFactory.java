package br.com.creational.factory.apple.simple.factory;

import br.com.creational.factory.apple.simple.model.IPhone;
import br.com.creational.factory.apple.simple.model.IPhoneX;
import br.com.creational.factory.apple.simple.model.IPhoneXSMax;
import br.com.creational.factory.apple.simple.model.IPhone11;
import br.com.creational.factory.apple.simple.model.IPhone11Pro;

public class IPhoneSimpleFactory {

    public IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        device = createIPhone(generation, level);

        if (device == null)
            return device;

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    private IPhone createIPhone(String generation, String level) {
        if (generation.equals("X")) {
            if (level.equals("standard")) {
                return new IPhoneX();
            } else if (level.equals("highEnd")) {
                return new IPhoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                return new IPhone11();
            } else if (level.equals("highEnd")) {
                return new IPhone11Pro();
            }
        }

        return null;
    }
}

package br.com.creational.factory.apple.simple.factory;

import br.com.creational.factory.apple.simple.model.IPhone;
import br.com.creational.factory.apple.simple.model.IPhoneX;
import br.com.creational.factory.apple.simple.model.IPhoneXSMax;
import br.com.creational.factory.apple.simple.model.IPhone11;
import br.com.creational.factory.apple.simple.model.IPhone11Pro;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {
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

    private static IPhone createIPhone(String generation, String level) {
        if ("X".equals(generation)) {
            if ("standard".equals(level)) {
                return new IPhoneX();
            } else if ("highEnd".equals(level)) {
                return new IPhoneXSMax();
            }
        } else if ("11".equals(generation)) {
            if ("standard".equals(level)) {
                return new IPhone11();
            } else if ("highEnd".equals(level)) {
                return new IPhone11Pro();
            }
        }

        return null;
    }
}

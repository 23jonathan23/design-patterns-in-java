package br.com.cod3r.factory.apple.factorymethod.factory;

import br.com.cod3r.factory.apple.factorymethod.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {
        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}

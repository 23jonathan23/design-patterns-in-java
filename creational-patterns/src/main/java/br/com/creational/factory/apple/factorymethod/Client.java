package br.com.creational.factory.apple.factorymethod;

import br.com.creational.factory.apple.factorymethod.factory.IPhone11Factory;
import br.com.creational.factory.apple.factorymethod.factory.IPhoneFactory;
import br.com.creational.factory.apple.factorymethod.factory.IPhoneXFactory;
import br.com.creational.factory.apple.factorymethod.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11Factory.orderIPhone();
		System.out.println(iphone2);
	}
}

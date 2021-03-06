package br.com.creational.factory.apple.simple;

import br.com.creational.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.creational.factory.apple.simple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhoneSimpleFactory genIphoneFactory = new IPhoneSimpleFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genIphoneFactory.orderIPhone("X", "standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = genIphoneFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}

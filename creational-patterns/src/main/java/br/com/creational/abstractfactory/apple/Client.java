package br.com.creational.abstractfactory.apple;

import br.com.creational.abstractfactory.apple.factory.IPhone11Factory;
import br.com.creational.abstractfactory.apple.factory.IPhoneFactory;
import br.com.creational.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.creational.abstractfactory.apple.factory.abstractFactory.*;
import br.com.creational.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory rulesUS = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rulesUS);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
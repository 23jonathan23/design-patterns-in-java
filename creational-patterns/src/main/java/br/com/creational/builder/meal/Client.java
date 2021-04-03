package br.com.creational.builder.meal;

import br.com.creational.builder.meal.builder.FastFoodMealBuilder;
import br.com.creational.builder.meal.builder.FatMealBuilder;
import br.com.creational.builder.meal.builder.JustFriesBuilder;
import br.com.creational.builder.meal.builder.Menu1Builder;
import br.com.creational.builder.meal.builder.Menu2Builder;
import br.com.creational.builder.meal.director.MealDirector;

public class Client {

	public static void main(String[] args) {
		order("Burger", new Menu1Builder());
		order("Veggie Burger", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Hear Atack", new FatMealBuilder());
	}

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructorCombo();
		System.out.println(director.getCombo());

		System.out.println("----------------");
	}
}
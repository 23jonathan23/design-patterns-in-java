package br.com.creational.builder.fluent;

import br.com.creational.builder.fluent.builder.FastFoodMealBuilder;
import br.com.creational.builder.fluent.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
			.andMain("CheeseBurger")
			.forDrink("Coke")
			.thatsAll();

		System.out.println(burguerCombo);

		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAtackCom = new FastFoodMealBuilder("Large Fries")
			.andMain("Monster Burger")
			.forDrink("Milk Shake")
			.andDessert("Fudge Cake")
			.andGift("2 Kilograms")
			.thatsAll();
		
			System.out.println(heartAtackCom);
	}
}
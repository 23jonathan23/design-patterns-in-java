package br.com.creational.builder.functional;

import br.com.creational.builder.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
			.andMain("CheeseBurger")
			.forDrink("Coke")
			.thatsAll();

		System.out.println(burguerCombo);

		FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAtackCom = new FastFoodMeal.Builder("Large Fries")
			.andMain("Monster Burger")
			.forDrink("Milk Shake")
			.andDessert("Fudge Cake")
			.andGift("2 Kilograms")
			.thatsAll();
		
			System.out.println(heartAtackCom);
	}
}
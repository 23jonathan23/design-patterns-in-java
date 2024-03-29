package br.com.creational.builder.meal.builder;

public class FatMealBuilder extends FastFoodMealBuilder{

    @Override
    public void buildDrink() {
        meal.setDrink("MilkShake");
    }

    @Override
    public void buildMain() {
        meal.setDrink("TripleCheddarBaconBurguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion Rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Large IceCream");
    }

    @Override
    public void buildGift() {
        meal.setToy("Hospital pass");
    }
}

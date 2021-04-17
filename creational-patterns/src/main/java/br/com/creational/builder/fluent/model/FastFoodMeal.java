package br.com.creational.builder.fluent.model;

public class FastFoodMeal {

	private String _drink;
	private String _main;
	private String _side;
	private String _dessert;
	private String _gift;

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		_drink = drink;
		_main = main;
		_side = side;
		_dessert = dessert;
		_gift = gift;
	}

	public String getDrink() {
		return _drink;
	}

	public void setDrink(String drink) {
		this._drink = drink;
	}

	public String getMain() {
		return _main;
	}

	public void setMain(String main) {
		this._main = main;
	}

	public String getSide() {
		return _side;
	}

	public void setSide(String side) {
		this._side = side;
	}

	public String getDessert() {
		return _dessert;
	}

	public void setDessert(String dessert) {
		this._dessert = dessert;
	}

	public String getToy() {
		return _gift;
	}

	public void setToy(String toy) {
		this._gift = toy;
	}

	@Override
	public String toString() {
		return "Combo [drink=" + _drink + ", main=" + _main + ", side=" + _side + ", dessert=" + _dessert + ", gift=" + _gift
				+ "]";
	}
}

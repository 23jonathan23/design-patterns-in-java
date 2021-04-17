package br.com.creational.builder.functional.model;

public class FastFoodMeal {

	private final String _drink;
	private final String _main;
	private final String _side;
	private final String _dessert;
	private final String _gift;

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

	public String getMain() {
		return _main;
	}

	public String getSide() {
		return _side;
	}

	public String getDessert() {
		return _dessert;
	}

	public String getToy() {
		return _gift;
	}

	@Override
	public String toString() {
		return "Combo [drink=" + _drink + ", main=" + _main + ", side=" + _side + ", dessert=" + _dessert + ", gift=" + _gift
				+ "]";
	}

	public static class Builder {
		//Mandatory
		private String _side;
		
		//Optinals
		private String _drink;
		private String _main;
		private String _dessert;
		private String _gift;
	
		public Builder(String side) {
			_side = side;
		}
	
		public Builder forDrink(String drink) {
			_drink = drink;
			return this;
		}
		
		public Builder andMain(String main) {
			_main = main;
			return this;
		}
	
		public Builder andDessert(String dessert) {
			_dessert = dessert;
			return this;
		}
		
		public Builder andGift(String gift) {
			_gift = gift;
			return this;
		}
	
		public FastFoodMeal thatsAll() {
			return new FastFoodMeal(_drink, _main, _side, _dessert, _gift);
		}
	}
}

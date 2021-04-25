package br.com.creational.prototype.functionalCloneBuilder.model;

public class User implements Cloneable{
	private final String name;
	private final Integer age;
	private final Address address;

	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Address cloneAdress = (Address) address.clone();
		return new User(name, age, cloneAdress);
	}

	public Builder cloneBuilder() {
		return new Builder(name, age, address);
	}

	public class Builder {
		private String name;
		private Integer age;
		private Address address;

		public Builder(String name, Integer age, Address address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withAddress(Address address) {
			this.address = address;
			return this;
		}

		public User now() {
			return new User(name, age, address);
		}
	}
}

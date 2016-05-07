package org.core.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable, Serializable {

	private static final long serialVersionUID = -4094142472190169269L;

	private int id;
	private String name;
	private int age;
	private List<Car> cars = new ArrayList<Car>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		List<Car> cars = person.getCars();
		List<Car> newcars = new ArrayList<>();
		for (int i = 0; i < cars.size(); i++) {
			Car car = (Car) cars.get(i).clone();
			newcars.add(car);
		}
		person.setCars(newcars);
		return super.clone();
	}

}

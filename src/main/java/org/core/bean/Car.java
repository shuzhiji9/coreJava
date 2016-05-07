package org.core.bean;

import java.io.Serializable;

public class Car implements Cloneable, Serializable {

	private static final long serialVersionUID = 3379240851392766481L;

	private int id;

	private String name;
	private float money;
	// 可以测试下车里有人的情况: 双向关联

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public Car() {
		super();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Car car = (Car) super.clone();
		return car;
	}
	
}

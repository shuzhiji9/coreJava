package org.core.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 反射测试数据
 * 
 * @author wangfei
 *
 * @date 2016年5月30日
 */
public class ReFlex implements Serializable {

	private static final long serialVersionUID = 7539502793697710595L;

	private String name;

	private int age;

	private double money;

	private Date date = new Date();

	private List<Car> cars = new ArrayList<Car>();

	public ReFlex() {
		super();
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

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

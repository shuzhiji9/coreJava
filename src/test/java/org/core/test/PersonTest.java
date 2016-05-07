package org.core.test;

import java.util.ArrayList;
import java.util.List;

import org.core.bean.Car;
import org.core.bean.Person;
import org.core.util.StringUtils;
import org.junit.Test;

public class PersonTest {
	
	private static int carid = 1;
	private static int personid = 1;
	
	@Test
	public void testPerson() throws CloneNotSupportedException{
		Person person = createPerson(3);
		Person clone = (Person) person.clone();
		person.setAge(11111);
		System.out.println(clone.toString());
		System.out.println(person.toString());
	}
	
	private static Person createPerson(int carL){
		Person person = new Person();
		person.setId(personid++);
		person.setName(StringUtils.getRandomString(4));
		person.setAge(StringUtils.getAge(2));
		List<Car> cars = new ArrayList<Car>();
		while(carL > 0){
			cars.add(createCar());
			carL--;
		}
		person.setCars(cars);
		return person;
	}
	
	private static Car createCar(){
		Car car = new Car();
		car.setId(carid++);
		car.setName(StringUtils.getRandomString(6));
		car.setMoney(StringUtils.getAge(5));
		return car;
	}
	
	
	
}

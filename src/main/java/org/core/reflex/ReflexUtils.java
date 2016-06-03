package org.core.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.core.bean.ReFlex;
import org.junit.Test;

public class ReflexUtils {

	/**
	 * 	测试属性复制
	 */
	@Test
	public void copyProperties() {
		ReFlex source = new ReFlex();
		source.setAge(7);
		
		
		
		ReFlex target = new ReFlex();
		ReflexUtils.copyProperties(source, target);
		System.out.println(target.toString());
	}

	/**
	 * 复制整个数据
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	public static ReFlex copyProperties(ReFlex source, ReFlex target) {
		// 1. 反射获取属性
		
		// 2. 循环属性获取
		
		// 3. 设置属性进去
		return target;
	}

	@Test
	public void TestMethod() throws Exception {
		Class<?> clazz = Class.forName("org.core.bean.ReFlex");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			String mName = m.getName();
			System.out.println(mName);
		}
	}

	@Test
	public void testFiledClass() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("org.core.bean.ReFlex");
		Field[] fields = clazz.getDeclaredFields();
		for (Field f : fields) {
			f.setAccessible(true);
			Type type = f.getGenericType();
			System.out.println(type);
			// if (type.toString().equals("class java.lang.String")) {
			// System.out.println(f.getName());
			// }
		}
	}

	/**
	 * 通过反射获取所有的属性
	 * 
	 * @throws ClassNotFoundException
	 */
	@Test
	public void testFileds() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("org.core.bean.ReFlex");
		Field[] fields = clazz.getDeclaredFields();
		for (Field f : fields) {
			f.setAccessible(true);
			String name = f.getName();
			System.out.println(name);
		}
	}

}

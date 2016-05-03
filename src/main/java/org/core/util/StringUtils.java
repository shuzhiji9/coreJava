package org.core.util;

public class StringUtils {
	public static void main(String[] args) {
		String hello = "Hello";
		int codePointCount = hello.codePointCount(1, 4);
		System.out.println(codePointCount);

	}
}

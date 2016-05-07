package org.core.util;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	/**
	 * 判断对象是否为空 (字符串/Number/布尔值/集合/Map/数组)
	 * @param obj	
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Object obj){
		if (obj == null) {
			return true;
		} else if (obj instanceof String) {
			return ((String)obj).trim().isEmpty();
		} else if (obj instanceof Number && ((Number) obj).doubleValue() == 0) {
			return true;
		} else if (obj instanceof Boolean && !((Boolean) obj)) {
			return true;
		} else if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Map && ((Map) obj).isEmpty()) {
			return true;
		} else if (obj instanceof Object[] && ((Object[]) obj).length == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断全部为数字
	 * @param str
	 * @return
	 */
	public static boolean isAllNumber(String str){
		Pattern pattern = Pattern.compile("[0-9]{1,}");
		 Matcher matcher = pattern.matcher(str);
		 return matcher.matches();
	}
	
	/**
	 * 判断全部为英文字母
	 * @param str
	 * @param capital 是否可大写
	 * @return
	 */
	public static boolean isAllCharacter(String str,boolean capital){
		String reg = "[a-z]{1,}";
		if(capital){
			reg = "[a-zA-Z]{1,}";
		}
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 判断是否满足正则表达式
	 * @param str 要判断的字符串
	 * @param reg 判断的正则表达式
	 * @return
	 */
	public static boolean isAllCharacter(String str,String reg){
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 随机生成字符串
	 * @param length 表示生成字符串的长度  
	 * @return
	 */
	public static String getRandomString(int length) {
	    String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	 }
	
	/**
	 * 随机生成一个岁数
	 * @param length
	 * @return
	 */
	public static Integer getAge(int length) {
	    String base = "0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return Integer.valueOf(sb.toString());     
	 }
	
	
	
	
	public static void main(String[] args) {
		boolean result = isAllCharacter("abcA",false);
		System.out.println(result);
		
	}
}

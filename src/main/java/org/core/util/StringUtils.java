package org.core.util;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	/**
	 * �ж϶����Ƿ�Ϊ�� (�ַ���/Number/����ֵ/����/Map/����)
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
	 * �ж�ȫ��Ϊ����
	 * @param str
	 * @return
	 */
	public static boolean isAllNumber(String str){
		Pattern pattern = Pattern.compile("[0-9]{1,}");
		 Matcher matcher = pattern.matcher(str);
		 return matcher.matches();
	}
	
	/**
	 * �ж�ȫ��ΪӢ����ĸ
	 * @param str
	 * @param capital �Ƿ�ɴ�д
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
	 * �ж��Ƿ�����������ʽ
	 * @param str Ҫ�жϵ��ַ���
	 * @param reg �жϵ�������ʽ
	 * @return
	 */
	public static boolean isAllCharacter(String str,String reg){
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * ��������ַ���
	 * @param length ��ʾ�����ַ����ĳ���  
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
	 * �������һ������
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

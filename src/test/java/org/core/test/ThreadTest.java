package org.core.test;

import java.util.Map;

/**
 * 获取当前线程
 * @author wangfei
 *
 * @date 2016年6月3日
 */
public class ThreadTest {
	public static void main(String[] args) {
		Map<Thread, StackTraceElement[]> stackTraces = Thread.getAllStackTraces();
		for(Map.Entry<Thread, StackTraceElement[]> stackTrace:stackTraces.entrySet()){
			Thread thread = stackTrace.getKey();
			StackTraceElement[] stack = stackTrace.getValue();
			if(thread.equals(Thread.currentThread())){
				continue;
			}
			System.out.println("线程: " + thread.getName() + "\n");
			for(StackTraceElement element:stack){
				System.out.println("\t " + element);
			}
		}
	}
}

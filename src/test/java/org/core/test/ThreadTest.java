package org.core.test;

import java.util.Map;

/**
 * ��ȡ��ǰ�߳�
 * @author wangfei
 *
 * @date 2016��6��3��
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
			System.out.println("�߳�: " + thread.getName() + "\n");
			for(StackTraceElement element:stack){
				System.out.println("\t " + element);
			}
		}
	}
}

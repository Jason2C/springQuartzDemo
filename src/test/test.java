package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	/**
	 * ���Ե�ʱ�򣬲���ʹ��JUnit
	 * @param args
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");

	}

}

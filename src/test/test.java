package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	/**
	 * 调试的时候，不能使用JUnit
	 * @param args
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");

	}

}

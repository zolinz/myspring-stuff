package zoli.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zolibeans.xml");

		HelloZoli obj = (HelloZoli) context.getBean("helloZoli");

		System.out.println(obj.getMessage());
	}

}

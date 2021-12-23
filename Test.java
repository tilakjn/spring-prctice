package demo.mavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		
  Student s= (Student)context.getBean("s1");
 s.display();

 Book b= (Book)context.getBean("s2");
 b.display();
 
 Emp e=(Emp)context.getBean("s3");
 e.display();

	}

}

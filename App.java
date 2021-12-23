package demo.jdbcDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	try {
    	ApplicationContext cont=new ClassPathXmlApplicationContext("Config.xml");
		
    	EmployeeOperation op= (EmployeeOperation)cont.getBean("operationdemo");
    	
    	employee e1=new employee();
    	e1.setEmail("tilakjain915");
    	e1.setId("113");
    	e1.setName("xyz");
    	e1.setSalary("6564");
    	int result=op.insert(e1);
    	System.out.print(result);
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}

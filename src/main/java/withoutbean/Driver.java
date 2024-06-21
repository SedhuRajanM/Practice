package withoutbean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("withoutbean.xml");
		Charger ch=applicationContext.getBean("charger",Charger.class);
		System.out.println(ch);
		
		Laptop la=applicationContext.getBean("laptop",Laptop.class);
		System.out.println(la);
		
	}
}

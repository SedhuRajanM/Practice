package mobilecharger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		
	Resource	 res=new ClassPathResource("mobilecharger.xml");
	BeanFactory beanFactory=new XmlBeanFactory(res);
	Charger ch=beanFactory.getBean("ch",Charger.class);
	Mobile mob=(Mobile) beanFactory.getBean("mob");
	
	System.out.println(ch);
	System.out.println(mob);
	}

}

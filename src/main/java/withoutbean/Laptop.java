package withoutbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("1")
	private int id;
	@Value("Lenovo")
	private String name;
	
	@Autowired
	private Charger ch;

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", ch=" + ch + "]";
	}
	
	

}

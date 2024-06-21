package withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Legs {
	@Value("4")
	private int leg;
	
	@Value("Left leg")
	private String name;

	@Override
	public String toString() {
		return "Legs [leg=" + leg + ", name=" + name + "]";
	}
	

}

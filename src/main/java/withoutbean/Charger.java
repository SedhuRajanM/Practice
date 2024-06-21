package withoutbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Charger {
	@Value("1")
	private int id;
	
	@Value("Ctype")
	private String type;

	@Override
	public String toString() {
		return "Charger [id=" + id + ", type=" + type + "]";
	}
	
	
}

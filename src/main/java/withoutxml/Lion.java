package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lion {
	
@Value("Sedhu")
	private String name;

@Autowired
	private Legs leg;

@Override
public String toString() {
	return "Lion [name=" + name + ", leg=" + leg + "]";
}

	
}

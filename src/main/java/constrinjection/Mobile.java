package constrinjection;

public class Mobile {

	private String name;
	private String color;
	
	private Charger charger;



	public Mobile(String name, String color, Charger charger) {
		super();
		this.name = name;
		this.color = color;
		this.charger = charger;
	}



	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", charger=" + charger + "]";
	}
	
}

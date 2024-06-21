package mobilecharger;

public class Mobile {

	private String name;
	private String color;
	
	private Charger charger;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", charger=" + charger + "]";
	}
	
}

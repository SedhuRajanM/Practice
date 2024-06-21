package constrinjection;

public class Charger {

	private int id;
	private String name;
	
	public Charger(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Charger [id=" + id + ", name=" + name + "]";
	}
	
	
}

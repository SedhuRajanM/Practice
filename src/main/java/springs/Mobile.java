package springs;

public class Mobile {
	
	private int id;
	private String name;
	private String color;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



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



	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + "]";
	}



	public void used() {
		System.out.println("sssssss");
	}

}

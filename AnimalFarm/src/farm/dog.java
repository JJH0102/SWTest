package farm;

public class dog extends Animal 
{
	dog (String name, String color, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println("¸Û¸Û");
	}
}

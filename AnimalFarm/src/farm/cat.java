package farm;

public class cat extends Animal 
{
	cat (String name, String color, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println("¾ß¿Ë");
	}
}

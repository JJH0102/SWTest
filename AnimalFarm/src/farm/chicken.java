package farm;

public class chicken extends Animal 
{
	chicken (String name, String color, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println("²¿³¢¿Ä");
	}
}

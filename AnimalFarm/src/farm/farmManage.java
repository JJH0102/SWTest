package farm;
import java.util.Scanner;
import java.util.ArrayList;

public class farmManage 
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		ArrayList<String> addDog = new ArrayList<>();
		ArrayList<String> addCat = new ArrayList<>();
		ArrayList<String> addChicken = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		String menu1, name, addName, checkName;
		int menu2, addAnimal, check = 0;
		boolean test = true;
		
		while (test) {
			System.out.println("1. ���� �߰� 2. ���� �˻� 3. �Ҹ����� 4. ��� ���� �Ҹ����� 5. ����");
			System.out.printf("�޴� �Է� : ");
			menu1 = scanner.next();
			
			switch(menu1) {
			case "1":
				System.out.println("1. Dog 2. Cat 3. Chicken");
				System.out.printf("�߰��� ���� : ");
				addAnimal = scanner.nextInt();
				
				if (addAnimal == 1) {
					System.out.printf("Dog�� �̸� : ");
					addName = scanner.next();
					addDog.add(addName);
				}
				
				else if (addAnimal == 2) {
					System.out.printf("Cat�� �̸� : ");
					addName = scanner.next();
					addCat.add(addName);
				}
				
				else if (addAnimal == 3) {
					System.out.printf("Chicken�� �̸� : ");
					addName = scanner.next();
					addChicken.add(addName);
				}
				
				break;
				
			case "2":
				System.out.println("1. Dog 2. Cat 3. Chicken");
				System.out.printf("�˻��� ���� : ");
				check = scanner.nextInt();
				
				if (check == 1) {
					System.out.printf("�˻��� Dog�� �̸� : ");
					checkName = scanner.next();
					System.out.println(addDog.indexOf(checkName));
				}
				
				else if (check == 2) {
					System.out.printf("�˻��� Cat�� �̸� : ");
					checkName = scanner.next();
					System.out.println(addCat.indexOf(checkName));
				}
				
				else if (check == 3) {
					System.out.printf("�˻��� Chicken�� �̸� : ");
					checkName = scanner.next();
					System.out.println(addChicken.indexOf(checkName));
				}
				
				break;
			
			/*case "3":
				System.out.println("1. Dog �Ҹ����� 2. Cat �Ҹ����� 3. Chicken �Ҹ�����");
				System.out.printf("�޴� �Է� : ");
				menu2 = scanner.nextInt();
				
				if (menu2 == 1) {
					
					animal = new dog();
					animal.speak();
				}
				
				else if (menu2 == 2) {
					animal = new cat();
					animal.speak();
				}
				
				else if (menu2 == 3) {
					animal = new chicken();
					animal.speak();
				}
				break;
			
			case "4":
				animal = new dog();
				animal.speak();
				
				animal = new cat();
				animal.speak();
				
				animal = new chicken();
				animal.speak();
				
				break;*/
			
			case "5":
				test = false;
				break;
			}
		}
	}
}

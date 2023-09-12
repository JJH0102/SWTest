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
			System.out.println("1. 동물 추가 2. 동물 검색 3. 소리내기 4. 모든 동물 소리내기 5. 종료");
			System.out.printf("메뉴 입력 : ");
			menu1 = scanner.next();
			
			switch(menu1) {
			case "1":
				System.out.println("1. Dog 2. Cat 3. Chicken");
				System.out.printf("추가할 동물 : ");
				addAnimal = scanner.nextInt();
				
				if (addAnimal == 1) {
					System.out.printf("Dog의 이름 : ");
					addName = scanner.next();
					addDog.add(addName);
				}
				
				else if (addAnimal == 2) {
					System.out.printf("Cat의 이름 : ");
					addName = scanner.next();
					addCat.add(addName);
				}
				
				else if (addAnimal == 3) {
					System.out.printf("Chicken의 이름 : ");
					addName = scanner.next();
					addChicken.add(addName);
				}
				
				break;
				
			case "2":
				System.out.println("1. Dog 2. Cat 3. Chicken");
				System.out.printf("검색할 동물 : ");
				check = scanner.nextInt();
				
				if (check == 1) {
					System.out.printf("검색할 Dog의 이름 : ");
					checkName = scanner.next();
					System.out.println(addDog.indexOf(checkName));
				}
				
				else if (check == 2) {
					System.out.printf("검색할 Cat의 이름 : ");
					checkName = scanner.next();
					System.out.println(addCat.indexOf(checkName));
				}
				
				else if (check == 3) {
					System.out.printf("검색할 Chicken의 이름 : ");
					checkName = scanner.next();
					System.out.println(addChicken.indexOf(checkName));
				}
				
				break;
			
			/*case "3":
				System.out.println("1. Dog 소리내기 2. Cat 소리내기 3. Chicken 소리내기");
				System.out.printf("메뉴 입력 : ");
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

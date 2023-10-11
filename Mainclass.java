package project01;

import java.util.Scanner;
import java.util.List;

public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String play1, play2;
		boolean game = true;
		
		while (game) {
			System.out.println("주사위 게임 프로그램입니다.");
			System.out.println("1. 플레이어 등록 2. 게임 시작 3. 게임 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			
			if (menu == 1) {				
				System.out.print("1번 플레이어의 이름을 입력 : ");
				play1 = sc.nextLine();
				System.out.print("2번 플레이어의 이름을 입력 : ");
				play2 = sc.nextLine();
				
				System.out.printf("1번 플레이어 : %s와 2번 플레이어 : %s(이)가 등록되었습니다.\n", play1, play2);
			}
			
			else if (menu == 2) {
				Play dienumber = new Play();
				int[] num = dienumber.dice();
				
				System.out.printf("첫번째 주사위 : %d, 두번째 주사위 : %d\n", num[0], num[1]);
				
				if (num[0] > num[1]) {
					System.out.println("1번 플레이어 승리!");
				}
				
				else {
					System.out.println("2번 플레이어 승리!");
				}
			}
			
			else if (menu == 3) {
				game = false;
				break;
			}
		}
	}
}

package project01;

import java.util.Random;
import java.util.List;

public class Play {
	public int[] dice() {
		Random random = new Random();
		int[] number = new int[2];
		
		number[0] = random.nextInt(6);
		number[0] = number[0] + 1;
		number[1] = random.nextInt(6);
		number[1] = number[1] + 1;
		
		return number;
	}
}

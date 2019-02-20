package Star;

import java.util.Scanner;
import Exception.NegativeNumException;

public class Diamond {

	public static void main(String[] args) throws NegativeNumException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. (자연수)");
		
		int num = input.nextInt();
		
		if (num < 0) {
			throw new NegativeNumException(num);
		} else {
			
			for (int i = 1; i < num * 2; i++) {
				for (int j = 1; j < num * 2; j++) {
					if (j > Math.abs(num - i) && (i - num < 0 ? j < num + i : j < Math.abs(i - num*2) + num)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}			
		}
	}
}
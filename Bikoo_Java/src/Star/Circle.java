package Star;

import java.util.Scanner;
import Exception.NegativeNumException;

public class Circle {
	
	public static void main(String[] args) throws NegativeNumException {

		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. (자연수)");

		int num = input.nextInt();

		if (num < 0) {
			throw new NegativeNumException(num);
		} else {
			for (int i = -num; i <= num; i++) {
				for (int j = -num; j <= num; j++) {
					if (i * i + j * j <= num * num) {
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

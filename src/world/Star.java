package world;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int star;
		int zero = 0;

		Scanner in = new Scanner(System.in);

		star = in.nextInt();
		in.close();

		for (int i = 0; i < star; i++) {
			zero++;
			for (int j = 0; j < zero; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

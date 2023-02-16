package world;

import java.util.Scanner;

public class MiddleStar {

	public static void main(String[] args) {
		int ms; //MiddleStar
		int star = -1;
		int space;
		
		Scanner in = new Scanner(System.in);

		ms = in.nextInt();
		in.close();
		
		space = 2*(ms-1);
		
		for (int i = 0; i < ms; i++) {
			star+=2;
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int q = 0; q < star; q++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			space -= 2;
		}
		
		// 4(x) -> 6(y)
		// 3(x) -> 4(y)
		// 2(x) -> 2(y)
		// 2(x-1) = y
		
		//oooooo*
		//oooo*o*o*
		//oo*o*o*o*o*
		//*o*o*o*o*o*o*
		
		//oooo*
		//oo*o*o*
		//*o*o*o*o*
		
		//oo*
		//*o*o*
	}
}

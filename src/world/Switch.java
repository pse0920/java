package world;

public class Switch {

	public static void main(String[] args) {

		int rank = 1;
		char medalColor;

		/*
		 * switch (rank) { case 1: medalColor = 'G'; case 2: medalColor = 'S'; case 3:
		 * medalColor = 'B'; default: medalColor = 'A'; }
		 */

		if (rank == 1) {
			medalColor = 'G';
		} else if (rank == 2) {
			medalColor = 'S';
		} else if (rank == 3) {
			medalColor = 'B';
		} else {
			medalColor = 'A';
		}
		System.out.println(medalColor);
	}
}

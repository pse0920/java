package world;

public class Casestr {
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("음메달입니다.");
		case "Bronze":
			System.out.println("동메달입니다.");
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}
}
import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
	
		int num1 = 3;
		int num2 = 9;
		int num3 = 13;
		int num4 = 21;
		int num5 = 32;
		int num6 = 41;
		int bonus = 34;
		
		
		Random 로또 = new Random();
		
		num1 = 로또.nextInt(45)+1;
		num2 = 로또.nextInt(45)+1;
		num3 = 로또.nextInt(45)+1;
		num4 = 로또.nextInt(45)+1;
		num5 = 로또.nextInt(45)+1;
		num6 = 로또.nextInt(45)+1;
		bonus = 로또.nextInt(45)+1;
		
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│          내 Lotto 번호 출력                       │");
		System.out.println("└──────────────────────────────────┘");
		
		
		System.out.println("┌────┬─────────────────────────────┐");
		System.out.println("│인덱스│            로또 번호                         │");
		System.out.println("├────┼─────────────────────────────┤");
		System.out.printf("│ 1  │ %-2d, %-2d, %-2d, %-2d, %-2d, %-2d, %-2d  │\n",num1,num2,num3,num4,num5,num6,bonus);
		System.out.println("└────┴─────────────────────────────┘");
		
		
		

	}

}

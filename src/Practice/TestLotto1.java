package Practice;

import java.util.Random;

public class TestLotto1 {

	public static void main(String[] args) {
		Random lotto = new Random();
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int bonus = 0;
		
		num1 = lotto.nextInt(45)+1;
		num2 = lotto.nextInt(45)+1;
		num3 = lotto.nextInt(45)+1;
		num4 = lotto.nextInt(45)+1;
		num5 = lotto.nextInt(45)+1;
		num6 = lotto.nextInt(45)+1;
		bonus = lotto.nextInt(45)+1;
		
		
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│───────────내 로또 번호 출력─────────────│");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.println("┌──────┬────────────────────────────┐");
		System.out.println("│ 인덱스  │         로또 번호                              │");
		System.out.println("├──────┼────────────────────────────┤");
		System.out.printf("│  1   │  %2d %2d %2d %2d %2d %2d %2d      │\n", num1, num2, num3,num4,num5,num6, bonus);
		System.out.println("└──────┴────────────────────────────┘");

	}

}

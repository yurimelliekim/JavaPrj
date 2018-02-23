package Practice;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("┌────────────────────────────────────┐");
		System.out.println("│          \"홀/짝\"확인 프로그램                           │");
		System.out.println("└────────────────────────────────────┘");
		System.out.println("숫자를 입력하세요>");
		num1 = scan.nextInt();
		
		if(num1 %2 ==0 ) {
		System.out.println("┌────┬─────────────────────────────┐");
		System.out.println("│입력값│           결과                                  │");
		System.out.println("├────┼─────────────────────────────┤");
		
		
		System.out.printf("│ %-2d │           짝수                                 │\n"
							,num1);
		System.out.println("└────┴─────────────────────────────┘");
		}
		
		
		else if (num1 %2 ==1 ){
		System.out.println("┌────┬─────────────────────────────┐");
		System.out.println("│입력값│           결과                                  │");
		System.out.println("├────┼─────────────────────────────┤");
		
		
		System.out.printf("│ %-2d │         홀수                                        │\n"
							,num1);
		System.out.println("└────┴─────────────────────────────┘");
		}
		else
			System.out.println("다시입력하세요");
			
		
		}
	}

}

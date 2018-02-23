package Practice;

import java.util.Random;
import java.util.Scanner;

public class Hw1227 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
	
		int bonus = 0;
		int sel = 0;
		int menu = 0;
		
		Random lotto = new Random();
		Scanner scan = new Scanner(System.in);
		
		벗어남:
		while(true) {
			System.out.println("┌────────────────────────────────────────────┐");
			System.out.println("│              로또 자동 판매기                                            │");
			System.out.println("└────────────────────────────────────────────┘");
			System.out.println("\t1.로또 구매하기");
			System.out.println("\t2.당첨번호 확인");
			System.out.println("\t3.종료");
			System.out.print("\t선택 >");
			menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("┌────────────────────────────────────────────┐");
			System.out.println("│              로또 자동 판매기                                            │");
			System.out.println("└────────────────────────────────────────────┘");
			System.out.println("\t1.수동");
			System.out.println("\t2.자동");
			System.out.println("\t3.취소");
			System.out.print("\t선택 >");
			sel = scan.nextInt();
			
			
			switch(sel) {
			case 1://수동
				System.out.printf("1~45중 하나의 숫자를 입력해 주세요");
				System.out.printf("1:");
				num1 = scan.nextInt();
				System.out.printf("2:");
				num2 = scan.nextInt();
				System.out.printf("3:");
				num3 = scan.nextInt();
				System.out.printf("4:");
				num4 = scan.nextInt();
				System.out.printf("5:");
				num5 = scan.nextInt();
				System.out.printf("6:");
				num6 = scan.nextInt();
				System.out.printf("7:");
				bonus = scan.nextInt();
			break;
			case 2://자동
				num1 = lotto.nextInt(45)+1;
				num2 = lotto.nextInt(45)+1;
				num3 = lotto.nextInt(45)+1;
				num4 = lotto.nextInt(45)+1;
				num5 = lotto.nextInt(45)+1;
				num6 = lotto.nextInt(45)+1;
				bonus = lotto.nextInt(45)+1;
			    break;
			}
			
		case 2:
			System.out.println("┌──────────────────────────────────┐");
			System.out.println("│          내 Lotto 번호 출력                        │");
			System.out.println("└──────────────────────────────────┘");
			
			
			System.out.println("┌────┬─────────────────────────────┐");
			System.out.println("│인덱스│            로또 번호                         │");
			System.out.println("├────┼─────────────────────────────┤");
			System.out.printf("│ 1  │ %-2d, %-2d, %-2d, %-2d, %-2d, %-2d, %-2d  │\n",num1,num2,num3,num4,num5,num6,bonus);
			System.out.println("└────┴─────────────────────────────┘");
			System.out.println("메인메뉴로 가기:Enter");
			break;
		case 3:
			 System.out.printf("종료");
			 break 벗어남;
			 
		default :
			System.out.println("메뉴의 범주를 벗어났습니다.");
		}
		
	}	
		
		
	}

}

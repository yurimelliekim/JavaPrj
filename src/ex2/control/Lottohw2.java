package ex2.control;

import java.util.Random;
import java.util.Scanner;

public class Lottohw2 {
	public static void main(String[] args) {
	Random 로또 = new Random();
	Scanner scan = new Scanner(System.in);
	
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	int num5 = 0;
	int num6 = 0;
	int bonus = 0;
	int menu = 0;
	int select = 0;
	
	num1 = 로또.nextInt(45)+1;
	num2 = 로또.nextInt(45)+1;
	num3 = 로또.nextInt(45)+1;
	num4 = 로또.nextInt(45)+1;
	num5 = 로또.nextInt(45)+1;
	num6 = 로또.nextInt(45)+1;
	bonus = 로또.nextInt(45)+1;
	
		벗어나고파:
		while(true)
		{
			System.out.println("┌────────────────────────────────────────────┐");
			System.out.println("│              로또 자동 판매기                                            │");
			System.out.println("└────────────────────────────────────────────┘");
			System.out.println("\t1.로또 구매하기");
			System.out.println("\t2.당첨번호 확인");
			System.out.println("\t3.종료");
			System.out.print("\t선택 >");
			menu = scan.nextInt();
			//select = scan.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("│              로또 자동 판매기                                            │");
				System.out.println("└────────────────────────────────────────────┘");
				System.out.println("\t1.수동");
				System.out.println("\t2.자동");
				System.out.println("\t3.취소");
				System.out.print("\t선택 >");
				menu = scan.nextInt();
				break;}
			switch(select) {
			case 1:
				System.out.println("1~45까지 숫자 중 하나를 입력해주세요.");
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
				System.out.printf("bonus:");
				bonus = scan.nextInt();
								
				System.out.println("┌────┬─────────────────────────────┐");
				System.out.println("│인덱스│            발권 번호                         │");
				System.out.println("├────┼─────────────────────────────┤");
				System.out.printf("│ 1  │ %-2d, %-2d, %-2d, %-2d, %-2d, %-2d, %-2d  │\n"
									,num1,num2,num3,num4,num5,num6,bonus);
				System.out.println("└────┴─────────────────────────────┘");
				
				
				
			
			case 2:
				System.out.println("┌────┬─────────────────────────────┐");
				System.out.println("│인덱스│            발권 번호                         │");
				System.out.println("├────┼─────────────────────────────┤");
				System.out.printf("│ 1  │ %-2d, %-2d, %-2d, %-2d, %-2d, %-2d, %-2d  │\n"
									,num1,num2,num3,num4,num5,num6,bonus);
				System.out.println("└────┴─────────────────────────────┘");
				System.out.println("메인 메뉴로 가기 : Enter");
				break;
			
			case 3:
				System.out.println("종료");
				break 벗어나고파;
			default:
				System.out.println("메뉴의 범주를 벗어났습니다.");
		}
	
		}
	
	}
}

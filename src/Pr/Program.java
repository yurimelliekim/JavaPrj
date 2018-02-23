package Pr;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Test test = new Test();
		
		int menu;
		
		
		EXIT:
		while(true) {
			menu = 메뉴();
			switch(menu) {
				case 1:
					Console.성적입력(test);
					break;
				case 2:
					Console.성적출력(test);
					break;
				case 3:
					break EXIT;
			
			}
				
		}

	}

	

	private static int 메뉴() {
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------메뉴-----------");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.printf("선택");
		menu = scan.nextInt();
		return menu;
	}

}

package ex2.control;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner 우진 = new Scanner(System.in);
		//Scanner scan = new Scanner(System.in);
		
		int kor, eng, math, total;
		int menu = 0;
		float avg;

		
		kor = 0;
		eng = 0;
		math = 0;
		while(true)
		{
			System.out.println("┌────────────────────────────────────────────┐");
			System.out.println("│                  메인 메뉴                                             │");
			System.out.println("└────────────────────────────────────────────┘");
			System.out.println("\t1.성적 입력");
			System.out.println("\t2.성적 출력");
			System.out.println("\t3.종료");
			System.out.print("\t선택 >");
			//System.out.println(" ");
			menu = 우진.nextInt();
			if(menu == 1)
			{
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("│                  성적 입력                                             │");
				System.out.println("└────────────────────────────────────────────┘");
				System.out.println(" ");
				
				
				System.out.printf("\t국어:");
				kor = 우진.nextInt();
				System.out.printf("\t영어:");
				eng = 우진.nextInt();
				System.out.printf("\t수학:");
				math = 우진.nextInt();
				System.out.println(" ");
			}
			else if(menu == 2)
			{
				total = kor+eng+math;
				avg = total/3;
			
			
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("│                  \"성적　출력\"                 │");
				System.out.println("└────────────────────────────────────────────┘");
				System.out.println(" ");
				
				System.out.printf("\t국어:%d\n",kor);
				System.out.printf("\t영어:%d\n",eng);
				System.out.printf("\t수학:%d\n",math);
				System.out.println(" ");
				
				System.out.printf("\t총점:%d\n",total);
				System.out.printf("\t평균:%.2f\n",avg);
				
				System.out.println("────────────────────────────────────────────");
			}
			else if(menu == 3)
				break;//System.exit(0);
			else
				System.out.println("메뉴의 범주를 벗어났습니다.");
		}
	}

	
}	
		



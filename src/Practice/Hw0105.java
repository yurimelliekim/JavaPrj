package Practice;

import java.util.Scanner;

public class Hw0105 {
	public static void main(String[] args) {
		
		Scanner 우진 = new Scanner(System.in);
		
		//국, 영, 수 를 담을 수 있는 배열을 생성하시오
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int index = 0;
		
		
		int kor, eng, math, total;
		int menu = 0;
		float avg;

		
		kor = 0;
		eng = 0;
		math = 0;
		
		벗어나고파:
		while(true)
		{
			System.out.println("┌────────────────────────────────────────────┐");
			System.out.println("│                  메인 메뉴                                             │");
			System.out.println("└────────────────────────────────────────────┘");
			System.out.println("\t1.성적 입력");
			System.out.println("\t2.성적 출력");
			System.out.println("\t3.종료");
			System.out.print("\t선택 >");
			menu = 우진.nextInt();
			
			
			
			switch(menu) {
			case 1:
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("│                  성적 입력                                             │");
				System.out.println("└────────────────────────────────────────────┘");
				System.out.println(" ");
				
				System.out.printf("%d 번 째 성적", index+1);
				System.out.printf("\t국어:");
				kor = 우진.nextInt();
				System.out.printf("\t영어:");
				eng = 우진.nextInt();
				System.out.printf("\t수학:");
				math = 우진.nextInt();
				System.out.println(" ");
				
				kors[index]=kor;
				engs[index]=eng;
				maths[index]=math;
				index++;
				
				break;
				
				
			case 2:
				
				
				for(int i=0;i<index; i++) {
					
				kor = kors[i];
				eng = engs[i];
				math = maths[i];
				
					
				total = kor+eng+math;
				avg = total/3;
			
			
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("│                  \"성적　출력\"                 │");
				System.out.println("└────────────────────────────────────────────┘");
				System.out.println(" ");
				
				System.out.printf("\t%d번째 성적\n",i+1);
				
				System.out.printf("\t국어:%d\n",kor);
				System.out.printf("\t영어:%d\n",eng);
				System.out.printf("\t수학:%d\n",math);
				System.out.println(" ");
				
				System.out.printf("\t총점:%d\n",total);
				System.out.printf("\t평균:%.2f\n",avg);
				
				System.out.println("────────────────────────────────────────────");
				}
				break;
				
				
			case 3:
				break 벗어나고파;
			default :
				System.out.println("메뉴의 범주를 벗어났습니다.");
			}
		}
	}

}

package ex6.array;

import java.util.Scanner;

public class WhileProg {
	
	
public static void main(String[] args) {
		
		Scanner 우진 = new Scanner(System.in);
		
		
		int kor, eng, math, total;
		int menu = 0;
		float avg;

		//국어 영어 수학을 3개씩 저장할 수 있는 배열을 생성하시오.
		int[] kors= new int[3];
		int[] engs= new int[3];
		int[] maths= new int[3];
		
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
			//System.out.println(" ");
			menu = 우진.nextInt();
			
			
			
			switch(menu) {
			case 1:
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("│                  성적 입력                                             │");
				System.out.println("└────────────────────────────────────────────┘");
				System.out.println(" ");
				
				
				
				//3번 반복하는데
				
				//for(int i=0;i<3;i++)
				do {
					System.out.printf("\t국어:");
					kor = 우진.nextInt();
					if(kor<0||kor>100)
					   System.out.println("성적의 범위 (0~100)를 벗어났습니다.");
					}
				while(kor<0||kor>100);
				/*while(kor<0||kor>100)
				{
					System.out.println("성적의 범위 (1~100)를 벗어났습니다.");
					System.out.println("\t국어>");
					kor = 우진.nextInt();
				}
				*/
				do {
					System.out.printf("\t영어:");
					eng = 우진.nextInt();
					if(eng<0||eng>100)
					   System.out.println("성적의 범위 (0~100)를 벗어났습니다.");
					}
				while(eng<0||eng>100);
				/*System.out.printf("\t영어:");
				eng = 우진.nextInt();
				while(eng<0||eng>100)
				{
					System.out.println("성적의 범위 (0~100)를 벗어났습니다.");
					System.out.println("\t영어>");
					eng = 우진.nextInt();
				}*/
				
				do {
					System.out.printf("\t수학:");
					math = 우진.nextInt();
					if(math<0||math>100)
					   System.out.println("성적의 범위 (0~100)를 벗어났습니다.");
					}
				while(math<0||math>100);
				/*System.out.printf("\t수학:");
				math = 우진.nextInt();
				while(math<0||math>100)
				{
					System.out.println("성적의 범위 (0~100)를 벗어났습니다.");
					System.out.println("\t수학>");
					math = 우진.nextInt();
				}*/
				System.out.println(" ");
				
				
			case 2:
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
				break;
			case 3:
				//System.exit(0);//break;쓰면 switch문에서만 벗어남/ break라벨; 끝까지 벗어남 exit(0) 0은 정상종료
				break 벗어나고파;
			default :
				System.out.println("메뉴의 범주를 벗어났습니다.");
			}
		}
	}

	
/*public static void main(String[] args) {
		
		Scanner 우진 = new Scanner(System.in);
		
		
		int kor, eng, math, total;
		
		
		//국어 영어 수학을 3개씩 저장할 수 있는 배열을 생성하시오.
				int[] kors= new int[3];
				int[] engs= new int[3];
				int[] maths= new int[3];
				
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
			//System.out.println(" ");
			menu = 우진.nextInt();
			
			
			
			switch(menu) {
			case 1:
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
				
				
			case 2:
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
				break;
			case 3:
				//System.exit(0);//break;쓰면 switch문에서만 벗어남/ break라벨; 끝까지 벗어남 exit(0) 0은 정상종료
				break 벗어나고파;
			default :
				System.out.println("메뉴의 범주를 벗어났습니다.");
			}
		}
	}
*/
	
}

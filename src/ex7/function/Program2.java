package ex7.function;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		
		 int kor=0; //kor는 변수
	     int eng=0;
	     int math=0;
		
	     int[] kors = new int[3]; //kors는 변수가 아님.
	     int[] engs = new int[3];
	     int[] maths = new int[3];
	     int index = 0; // 데이터 관리를 위한 변수  
		
		int menu;
		
		
		
		while(true) {
			menu=메뉴입력();
			
			switch(menu) {
			case 1:		  
							//  공유   공유  공유  값
				index=성적입력(kors, engs, maths, index);//(참조변수라고 하지만 변수는 아님) 부르는 거임, '참조'라고부름
												//kors, engs, maths는 변수가 아님. 저장할 공간이 없음
		
			break;
			case 2:
				성적출력(kors, engs, maths, index);
			break;
			case 3:
				종료();
			
			}
		}
		
		

	}

	private static int 메뉴입력() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  메인 메뉴                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println("\t1.성적 입력");
		System.out.println("\t2.성적 출력");
		System.out.println("\t3.종료");
		System.out.print("\t선택 >");
		int menu = scan.nextInt();//안에만 선언이 가능하면 여기에넣는게좋음.  
		
		
		return menu;
	}

	private static int 성적입력(int[] kors, int[] engs, int[] maths, int index) {
																//index는 값이라서 공유하는것이 아닌것으로되어있음
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  성적 입력                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");
		
		System.out.printf("%d 번 째 성적", index+1);
		System.out.printf("\t국어:");
		int kor = scan.nextInt();
		System.out.printf("\t영어:");
		int eng = scan.nextInt();
		System.out.printf("\t수학:");
		int math = scan.nextInt();
		System.out.println(" ");
		
		kors[index]=kor;
		engs[index]=eng;
		maths[index]=math;
		index++;
		return index; //성적입력함수의 index만 증가된 형태임. main함수의 index는 그대로 0임.
		
	}

	private static void 성적출력(int[] kors, int[] engs, int[] maths, int index) {
		
		for(int i=0;i<index; i++) {
			
			
		
		
			System.out.println("┌────────────────────────────────────────────┐");
			System.out.println("│                  \"성적　출력\"                 │");
			System.out.println("└────────────────────────────────────────────┘");
			System.out.println(" ");
			
			System.out.printf("\t%d번째 성적\n",i+1);
			
			System.out.printf("\t국어:%d\n",kors[i]);
			System.out.printf("\t영어:%d\n",engs[i]);
			System.out.printf("\t수학:%d\n",maths[i]);
			System.out.println(" ");
			
			 int kor = kors[i];
			 int eng = engs[i];
			 int math = maths[i];
			
			int total = kor+eng+math;
			float avg = total/3;
			
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
			System.out.println("────────────────────────────────────────────");
			}
		
		
	}

	private static void 종료() {
		
		System.exit(0);
		
	}

}

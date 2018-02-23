package Practice;

import java.util.Scanner;

public class Pr0108 {

	public static void main(String[] args) {
		
		
	/*	int kor = 0;
		int eng = 0;
		int math = 0;
		
		int menu;
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		
		
		
		Exam exam = new Exam();
		int index = 0;
		
		while(true) {
			menu = 메뉴입력();
			switch(menu) {
			case 1:
				성적입력(exam);
				break;
			case 2:
				성적출력(exam);
				break;
			case 3:
				종료();
				break;
			}	

		}
			
	}            

	private static void 성적입력(Exam exam) {
		
		
		Scanner scan = new Scanner(System.in);
		int kor ;
		int eng;
		int math;
		
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  성적 입력                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");
		
		
			
			
		System.out.printf("%d번째 성적",1);
		System.out.println("\t1.국어:");
		kor = scan.nextInt();
		System.out.println("\t2.영어:");
		eng = scan.nextInt();
		System.out.println("\t3.수학:");
		math = scan.nextInt();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		
		
		
		}

	private static void 성적출력(Exam exam) {
		
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  성적 출력                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");
		
		
		for(int i = 0; i<1 ; i++) {
				
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;			
				
			System.out.printf("\t1.국어:%d",kor);
			System.out.printf("\t2.영어:%d",eng);
			System.out.printf("\t3.수학:%d",math);
			
			
			int total = kor + eng + math ;
			float avg = total/3;
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
		}
		
		
		
	}

	private static void 종료() {
		
		System.exit(0);
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
	
		int menu = scan.nextInt();
		
		return menu;*/
	}

}

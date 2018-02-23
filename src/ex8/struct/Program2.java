package ex8.struct;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		
		/* int kor; //kor는 변수
	     int eng;
	     int math;
	     */
	     Exam exam = new Exam();//기본형이 아닌것은 다 공유임, Exam 클릭해서 create
		
	    /* int[] kors = new int[3]; //kors는 변수가 아님.
	     int[] engs = new int[3];
	     int[] maths = new int[3];*/
	     //int index = 0; // 데이터 관리를 위한 변수  
		
		int menu;
		final int INPUT = 1;//변수가 아닌 상수로 하기 위해서 앞에 final씀
		final int PRINT = 2;
		
		EXIT:
		while(true) {
			menu=메뉴입력();
			
			switch(menu) {
			case INPUT:	//숫자로 쓰면 식별할 때 의미파악이 잘 안되서 잘 안씀  
							
				성적입력(exam);//(참조변수라고 하지만 변수는 아님) 부르는 거임, '참조'라고부름
												//kors, engs, maths는 변수가 아님. 저장할 공간이 없음
		
				break;
			case PRINT:
				성적출력(exam);
				break;
			case 3:
				break EXIT;
				//함수자체를빠져나가야함,이거자체를 함수로 만들이유가없음, [대문자]로 써야함 (소문자는 새로운 symbol로 느껴질 수 있음)
			
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

	private static void 성적입력(Exam exam) {
																//index는 값이라서 공유하는것이 아닌것으로되어있음
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  성적 입력                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");
		
		System.out.printf("%d 번 째 성적", 0+1);
		System.out.println("");
		System.out.printf("\t국어:");
		int kor = scan.nextInt();
		System.out.printf("\t영어:");
		int eng = scan.nextInt();
		System.out.printf("\t수학:");
		int math = scan.nextInt();
		System.out.println(" ");
		
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		
		/*
		kors[index]=kor;
		engs[index]=eng;
		maths[index]=math;
		index++;
		return index; //성적입력함수의 index만 증가된 형태임. main함수의 index는 그대로 0임.
*/		
	}

	private static void 성적출력(Exam exam) {

		 int kor; //kor는 변수
	     int eng;
	     int math;
	     int total;
	     float avg;
	     
		
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  \"성적　출력\"                 │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");

		for(int i=0;i<1; i++) {
			
			
			 kor = exam.kor;//exam안에 있는 kor값을 가져온다
			 eng = exam.eng;
			 math = exam.math;
			
			
			
			System.out.printf("\t%d번째 성적\n",i+1);
			
			System.out.printf("\t국어:%d\n",kor);
			System.out.printf("\t영어:%d\n",eng);
			System.out.printf("\t수학:%d\n",math);
			System.out.println(" ");
			
			total = kor+eng+math;
			avg = total/3;
			
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
			System.out.println("────────────────────────────────────────────");
			}
		
		
	}

	

}

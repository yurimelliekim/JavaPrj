package Pr125interface;

import java.util.Scanner;



public class ExamConsole {//이걸 재사용 하고싶어~~ 부품으로 쓸 수 없고, 틀로써야하므로 객체생성못함.
	
	private Exam exam;
	private ConsoleListener consolelistener;
	
	/*public ExamConsole() {
		
	}*/


	public ExamConsole() {
		this.exam = exam;
	}
	
	
	public void setConsolelistener(ConsoleListener consolelistener) {
		this.consolelistener = consolelistener;
	}


	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	

	public void input() {//이건 인스턴스함수가 될 수 없음.데이터구조를 쓸 일이 없어서.
			
			Scanner scan = new Scanner(System.in);
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│                  성적 입력                                           │");
			System.out.println("└───────────────────────────────────┘");
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
			//onInput(exam);
			exam.setKor(kor);//이건 데이터 구조로 갈 수 없음. 값을 설정, 가져오는 것
			//exam.setKor(kor);//객체지향, 두가지 방법이 있음.exam의 국어성적
			exam.setEng(eng);
			//Exam.setEng(exam, eng);//수많은 input중에 Exam이라는 클래스가 들어가야함 어디서 가져와야하는지 알아야해서
			//개체    //객체,exam객체를 넘겨받음.
			exam.setMath(math);//exam.math = math;
			
			
			
			if(consolelistener != null)
			consolelistener.onInput(exam);
			//consolelistener.onInput(exam);
			
		}
	  		
	public void print() {//이건 인스턴스함수가 될 수 없음.데이터구조를 쓸 일이 없어서.

		 int kor; //kor는 변수
	     int eng;
	     int math;
	     int total;
	     float avg;
		
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│                  \"성적　출력\"                                    │");
		System.out.println("└──────────────────────────────────┘");
		System.out.println(" ");

		for(int i=0;i<1; i++) {
			
			kor = exam.getKor();
			eng = exam.getEng();
			math = exam.getMath();
			
			total = exam.total();
			avg = exam.avg();	
			
			System.out.printf("\t%d번째 성적\n",i+1);
			
			System.out.printf("\t국어:%d\n",kor);
			System.out.printf("\t영어:%d\n",eng);
			System.out.printf("\t수학:%d\n",math);
			
			if(consolelistener != null)
			consolelistener.onPrint(exam);
			
		
			System.out.println(" ");
			
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
			System.out.println("──────────────────────────────────");
			}
	}
	
}

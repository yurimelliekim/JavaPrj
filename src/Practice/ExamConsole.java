package Practice;

import java.util.Scanner;

public abstract class ExamConsole {//UI,함수의 묶음 Exam을입출력할수있는묶음
	private Exam exam;

	
	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}


	public ExamConsole() {
		exam = newExam();//이걸 틀로 써야하니까 객체로 못만들어서 함수로 바꿔버림.
	}
		
	
	public abstract Exam newExam();//틀로 쓰는거라서 abstract하면 이 위에 이그잼콘솔도 abstract


	public void input() {
			
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
			
			exam.setKor(kor);//이건 데이터 구조로 갈 수 없음. 값을 설정, 가져오는 것
			//exam.setKor(kor);//객체지향, 두가지 방법이 있음.exam의 국어성적
			exam.setEng(eng);
			//Exam.setEng(exam, eng);//수많은 input중에 Exam이라는 클래스가 들어가야함 어디서 가져와야하는지 알아야해서
			//개체    //객체,exam객체를 넘겨받음.
			exam.setMath(math);//exam.math = math;
			
			
			//onInput(exam);
			
			
		}
	  
	  //protected abstract void onInput(Exam exam);


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
			
			kor = exam.getKor();//exam안에 있는 kor값을 가져온다, get:가져온다, set도
			//  └this.생략가능(여기클래스에서 있는걸 쓰는 거라서
			eng = exam.getEng();//(exam)안에서 함수값을 가져온다. 껍데기라서 가지고오는거임
			math = exam.getMath();//exam.math;, getMath에 갖다대고 create
			//onPrint(exam);
		
			total = exam.total();
			//total = Exam.total(exam);//kor+eng+math;
			//avg = Exam.avg(exam);//total/3;
			//avg = exam.avg();'exam의 객체'(<-주어혹은 목적어가됨)를 평균내라
			avg = exam.avg();	
			
			System.out.printf("\t%d번째 성적\n",i+1);
			
			System.out.printf("\t국어:%d\n",kor);
			System.out.printf("\t영어:%d\n",eng);
			System.out.printf("\t수학:%d\n",math);
			System.out.println(" ");
			
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
			System.out.println("──────────────────────────────────");
			
			
		
		}
	}


	//protected abstract void onPrint(Exam exam);
	
	
}

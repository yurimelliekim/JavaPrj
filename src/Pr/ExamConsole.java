package Pr;

import java.util.Scanner;
import Pr.Exam;


public class ExamConsole {
	private Exam exam;
	
	
	
	private ConsoleListener consolelistener;
	
	
	
	public void setConsolelistener(ConsoleListener consolelistener) {
		this.consolelistener = consolelistener;
	}

	public ExamConsole() {
		
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	
		
		

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
			
			exam.setKor(kor);
			
			exam.setEng(eng);
			
			exam.setMath(math);
			
			consolelistener.onInput(exam);
			
		}
	  		

	public void print() {

		 int kor; 
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
			
			total = exam.total();
			//total = Exam.total(exam);//kor+eng+math;
			//avg = Exam.avg(exam);//total/3;
			//avg = exam.avg();'exam의 객체'(<-주어혹은 목적어가됨)를 평균내라
			avg = exam.avg();	
			
			System.out.printf("\t%d번째 성적\n",i+1);
			
			System.out.printf("\t국어:%d\n",kor);
			System.out.printf("\t영어:%d\n",eng);
			System.out.printf("\t수학:%d\n",math);
			consolelistener.onPrint(exam);
			System.out.println(" ");
			
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
			System.out.println("──────────────────────────────────");
			}
	}
	
}

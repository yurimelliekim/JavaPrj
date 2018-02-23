package ex9.capsule;

import java.util.Scanner;

public class ExamConsole {//UI
	

	  public static void 성적입력(Exam exam) {
			
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
			
			Exam.setKor(exam, kor);//exam.kor = kor;
			//exam.setKor(kor);//객체지향, 두가지 방법이 있음.exam의 국어성적
			
			Exam.setEng(exam, eng);//수많은 input중에 Exam이라는 클래스가 들어가야함 어디서 가져와야하는지 알아야해서
			//개체    //객체,exam객체를 넘겨받음.
			Exam.setMath(exam, math);//exam.math = math;
			
		}
	  
	  public static void 성적출력(Exam exam) {

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
			
			kor = Exam.getKor(exam);//exam안에 있는 kor값을 가져온다, get:가져온다, set도
			eng = Exam.getEng(exam);//(exam)안에서 함수값을 가져온다. 껍데기라서 가지고오는거임
			math = Exam.getMath(exam);//exam.math;, getMath에 갖다대고 create
			
			total = Exam.total(exam);//kor+eng+math;
			avg = Exam.avg(exam);//total/3;
			//avg = exam.avg();'exam의 객체'(<-주어혹은 목적어가됨)를 평균내라
			
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
	
}

package ex10.oop.is_a;

import java.util.Scanner;

//import ex9.capsule.Exam;같은 패키지에서 쓸거라서 지움

public class ExamConsole {//UI,함수의 묶음 Exam을입출력할수있는묶음
	private Exam exam;//exam객체를 private으로 사용하겠다.
	//			exam변수가아니라 정의임!! 함수안에서만 변수선언됨,클래스안이라 정의임
	//private이라서 객체화 할 이유가 생김
	//이상태로 exam은 null이라서 생성자가필요하고 초기값이필요함
	
	//Has a 관계
	//1. Composition Has a 관계 (일체형구성,스스로만듬)1:1관계  조립할 필요가 없어서 편함, 부품을 바꿀 수 없음(확장성이 떨어짐)
	//2. Association Has a 관계 (분리형관계,누군가가 만들어서 사용할 수 있음)1:1관계, 조립하는데 힘든반면 언제든지 부품을 교체할 수 있음
	//3. Aggregation Has a 관계 (집합, 1:다 관계)
	
	public ExamConsole() {//ExamConsole()생성자. 콘솔이 이그잼을 가지고 있는 방식으로
		exam = new Exam();//ExamConsole개체를 생성하면서 exam객체를 생성.
	}//"초기값을 생성하기 위해서 생성자가있어야함!!!!!!!!!!!!!!!!!!!!!!",생성자를 사용해서 내가필요한것을써야함
	//여기있는 초기값은 Exam에서가져옴.
	
	
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
			
			exam.setKor(kor);//이건 데이터 구조로 갈 수 없음. 값을 설정, 가져오는 것
			//exam.setKor(kor);//객체지향, 두가지 방법이 있음.exam의 국어성적
			exam.setEng(eng);
			//Exam.setEng(exam, eng);//수많은 input중에 Exam이라는 클래스가 들어가야함 어디서 가져와야하는지 알아야해서
			//개체    //객체,exam객체를 넘겨받음.
			exam.setMath(math);//exam.math = math;
			
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
			System.out.println(" ");
			
			System.out.printf("\t총점:%d\n",total);
			System.out.printf("\t평균:%.2f\n",avg);
			
			System.out.println("──────────────────────────────────");
			}
	}
	
}

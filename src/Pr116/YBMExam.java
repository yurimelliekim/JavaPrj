package Pr116;

import java.util.Scanner;

import Pr.ConsoleListener;
import Pr.Exam;

public class YBMExam extends Exam /*implements ConsoleListener*/{ //이거를 만들었을 때 YBMExam에 빨간줄이 뜨는 이유는 Exam에서 자식인 너가 정하라는
								//abstract가 걸려있는게 있어서 빨간줄이 뜸. 이것을 오버라이드함수를 만들어야함.

	private int com;//생성자로초기값을 만들어야함
	
	public YBMExam() {
		this(0,0,0,0);
	}
	
	public YBMExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	@Override
		public int total() {
			
			return super.total()+com;
		}
	@Override
		public float avg() {
			return total()/4.0f;
		}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

/*	@Override
	public void onInput(Exam exam) {
		
	YBMExam ybmexam = (YBMExam)exam;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t컴퓨터:");
		int com = scan.nextInt();
		ybmexam.setCom(com);
	}

	@Override
	public void onPrint(Exam exam) {
		YBMExam ybmexam = (YBMExam)exam;
		int com = ybmexam.getCom();
		System.out.printf("\t컴퓨터:%d",com);
		
	}*/
	public class YBMConsoleListener implements ConsoleListener{

	@Override
	public void onInput(Exam exam) {
		
		YBMExam ybmexam = (YBMExam)exam;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t컴퓨터:");
		int com = scan.nextInt();
		ybmexam.setCom(com);
	}

	@Override
	public void onPrint(Exam exam) {
		
		YBMExam ybmexam = (YBMExam)exam;
		int com = ybmexam.getCom();
		System.out.printf("\t컴퓨터:%d",com);
	}
		
	}

	
}

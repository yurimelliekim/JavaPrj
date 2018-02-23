package Pr116;

import Pr.ExamConsole;

import java.util.Scanner;

import Pr.ConsoleListener;
import Pr.Exam;
public class Program116 {//Practice패키지에 Exam과 ExamConsole

	public static void main(String[] args) {
		
		
		YBMExam exam = new YBMExam();
		
		//공통분모객체생성
		ExamConsole console = new ExamConsole();
		
		console.setExam(exam);
	
		//방법1.새로운 클래스에 구현
	/*	YBMConsoleListener ybmlistener = new YBMConsoleListener();
		
		console.setConsolelistener(ybmlistener);*/
		
		//방법2 : 인터페이스를 기존의 클래스에 구현
		
		/*console.setConsolelistener(exam);*/
		
		
		//방법3.중첩클래스에구현.
		
		//방법:메소드 내부 중첩클래스를 익명으로 구현(자료형, new의방법,인터페이스를 객체로)

		ConsoleListener listener = new ConsoleListener() {
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
		};
		
		
		console.input();
		console.print();
	}

}

package Pr116;

import java.util.Scanner;

import Practice.Exam;
import Practice.ExamConsole;

public class YBMConsole extends ExamConsole{

	@Override
	public Exam newExam() {//newExam을써야하는데직접적으로 쓸 수 없으니
		
		return new YBMExam();//객체화를 시켜서 써야하니까!
	}


@Override
	public void input() {//인풋은이게편함.
		Scanner scan = new Scanner(System.in);
		super.input();
		YBMExam ybmexam = (YBMExam)getExam();
		int com = scan.nextInt();
		System.out.println("컴퓨터:");
		//((YBMExam)getExam()).setCom(com);
		ybmexam.setCom(com);
	
}

/*	@Override
	protected void onInput(Exam exam) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t컴퓨터:");
		int com = scan.nextInt();
		((YBMExam)exam).setCom(com);
	
	}
	
	@Override
	protected void onPrint(Exam exam) {//프린트는이게편함
		int com = ((YBMExam)exam).getCom();
		System.out.printf("\t컴퓨터:%d",com);
		
	}

	
*/	
}

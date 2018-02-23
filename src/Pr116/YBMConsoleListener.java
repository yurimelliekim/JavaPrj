package Pr116;

import java.util.Scanner;

import Pr.ConsoleListener;
import Pr.Exam;

public class YBMConsoleListener implements ConsoleListener {

	@Override
	public void onInput(Exam exam) {
		
		YBMExam ybmexam = (YBMExam)exam;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t컴퓨터:");
		int com = scan.nextInt();
		ybmexam.setCom(com);
		//((YBMExam)exam).setCom(com);
		
	}

	@Override
	public void onPrint(Exam exam) {
		YBMExam ybmexam = (YBMExam)exam;
		int com = ybmexam.getCom();
		System.out.printf("\t컴퓨터:%d",com);
		
	}

	
	
	
	
	
}

package Pr125interface;

import java.util.Scanner;

public class PConsoleListener implements ConsoleListener{

	@Override
	public void onInput(Exam exam) {
		
		PExam pexam = (PExam)exam;
		Scanner scan = new Scanner(System.in);
		System.out.printf("\t컴퓨터:");
		int com = scan.nextInt();
		pexam.setCom(com);
		
		
	}

	@Override
	public void onPrint(Exam exam) {
		PExam pexam = (PExam)exam;
		int com = pexam.getCom();
		System.out.printf("\t컴퓨터:%d\n",com);
		
	}

	
	
	
}

package ex10.oop.constructor;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	
		ExamConsole console =new ExamConsole();//console객체생성
		console.input();
		console.print();
		
		
		int kor, eng, math;
		Exam exam = new Exam(1,1,1);
		System.out.print("kor, eng, math");
	}
}

	



package Practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│─────────성적 입력───────────│");
		System.out.println("└──────────────────────────┘");
		
		System.out.printf("\t국어:");
		kor = scan.nextInt();
		System.out.printf("\t영어:");
		eng = scan.nextInt();
		System.out.printf("\t수학:");
		math = scan.nextInt();
		
		total = kor + eng + math;
		avg = total/3;
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│─────────성적 출력───────────│");
		System.out.println("└──────────────────────────┘");
		
		System.out.printf("\t국어:%3d\n \t영어:%3d\n \t수학:%3d\n", kor, eng, math);
		System.out.printf("\t총점:%3d\n \t평균:%5.2f\n", total, avg);

	}

}

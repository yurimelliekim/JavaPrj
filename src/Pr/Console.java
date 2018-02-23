package Pr;

import java.util.Scanner;

public class Console {

	public static void 성적출력(Test test) {
		int kor;
		int eng;
		int math;
		int total;
		float avg;
		
		kor = test.getKor();
		eng = test.getEng();
		math = test.getMath();
		
		total = test.total();
		avg = test.avg();
		
		
		System.out.println("------------성적출력-----------");
		System.out.printf("1.국어:%3d",kor);
		System.out.printf("2.영어:%3d",eng);
		System.out.printf("3.수학:%3d",math);
		System.out.printf("4.총점:%3d",total);
		System.out.printf("5.평균:%.3f",avg);
		
	}

	public static void 성적입력(Test test) {
		Scanner scan = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.println("------------성적입력-----------");
		System.out.println("1.국어");
		kor = scan.nextInt();
		System.out.println("2.영어");
		eng = scan.nextInt();
		System.out.println("3.수학");
		math = scan.nextInt();
		
		test.setKor(kor);
		test.setEng(eng);
		test.setMath(math);
		
	}
	
	
}

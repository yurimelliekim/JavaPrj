import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		
		Scanner 유림 = new Scanner(System.in);
		
		int kor, eng, math, total;
		float avg;
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│            \"성적 입력\"             │");
		System.out.println("└──────────────────────────────────┘");
		
		System.out.printf("\t국어:");
		kor = 유림.nextInt();
		System.out.printf("\t영어:");
		eng = 유림.nextInt();
		System.out.printf("\t수학:");
		math = 유림.nextInt();
	
		total = kor+eng+math;
		avg = total/3;
		
		System.out.println("┌──────────────────────────────────┐");
		System.out.println("│            \"성적 출력\"             │");
		System.out.println("└──────────────────────────────────┘");
		
		System.out.printf("\t국어:%10d\n",kor);
		System.out.printf("\t영어:%10d\n",eng);
		System.out.printf("\t수학:%10d\n",math);
		System.out.printf("\t총점:%10d\n",total);
		System.out.printf("\t평균:%10.2f\n", avg);
	}

}

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner 우진 = new Scanner(System.in);
		
		
		int kor, eng, math, total;
		float avg;

		
		/*kor = 60;
		eng = 70;
		math = 80;*/
		
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  성적 입력                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");
		
		
		System.out.printf("\t국어:");
		kor = 우진.nextInt();
		System.out.printf("\t영어:");
		eng = 우진.nextInt();
		System.out.printf("\t수학:");
		math = 우진.nextInt();
		System.out.println(" ");
        
		total = kor+eng+math;
		avg = total/3;
		
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  \"성적　출력\"                 │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println(" ");
		

	
		System.out.printf("\t국어:%d\n",kor);
		System.out.printf("\t영어:%d\n",eng);
		System.out.printf("\t수학:%d\n",math);
		System.out.println(" ");
		
		System.out.printf("\t총점:%d\n",total);
		System.out.printf("\t평균:%.2f\n",avg);
		
		System.out.printf("────────────────────────────────────────────");
	}

}

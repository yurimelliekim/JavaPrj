
public class Program {

	public static void main(String[] args) {
		
		int kor, eng, math, total;
		float avg;

		kor = 60;
		eng = 70;
		math = 80;
		
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
		
		/*System.out.printf("\t총점:%d\n",total);
		System.out.printf("\t평균:%.2f\n",avg);*/
		System.out.printf("\t총점:%d\n \t평균:%.2f\n \t%2$f\n",total,avg);
		System.out.printf("────────────────────────────────────────────");
	}

}

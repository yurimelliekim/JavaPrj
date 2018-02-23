class Home{

  public static void main(String[] args){
	
	int kor, eng, math, total;
	float avg;

	kor = 60;
	eng = 70;
	math = 80;
	total = kor+eng+math;
	avg = total/3;
	

	System.out.println("┌────────────────────────────────────────────┐");
	System.out.println("│　　　　　　  　  성적 출력　　　　　　 　　│");
	System.out.println("└────────────────────────────────────────────┘");
	System.out.println(" ");

	

	System.out.printf("       국어:%d\n",kor);
	System.out.printf("       영어:%d\n",eng);
	System.out.printf("       수학:%d\n",math);
	System.out.print(" \n");
	System.out.printf("       총점:%d\n",total);
	System.out.printf("       평균:%f\n",avg);
	}
}


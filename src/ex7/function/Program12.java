package ex7.function;

import java.util.Scanner;

public class Program12 {
	
	public static void main(String[] args) { 
		
		 int kor=0;
	     int eng=0;
	     int math=0;
		
	     int[] kors = new int[3];
	     int[] engs = new int[3];
	     int[] maths = new int[3];
	     int index = 0; // 데이터 관리를 위한 변수
		
		int menu;
		
		
		벗어나고파:
		while(true) {
			menu=메뉴입력();
			
			switch(menu) {
			case 1:
				성적입력(kors, engs, maths, index);
			break;
			case 2:
				성적출력(kors, engs, maths, index);
			break;
			case 3:
				종료();
			}
		}
	
		
	}

	public static void 종료() {
		
		   
	}

	public static void 성적출력(int[] kors, int[] engs, int[] maths, int index) {
		  for(int i=0; i<index; i++)   {
			  //int kor=0;
			  //int eng=0;
			 // int math=0;
			  
			  int total =0;
			  float avg = 0;
			  
             int kor=kors[index];
             int eng=engs[index];
             int math=maths[index];
              
              total = kor + eng + math;
              avg = total / 3;
              
           System.out.println("┌───────────┐");
           System.out.println("│  성적출력          │");
           System.out.println("└───────────┘");
           System.out.printf("\t국어: %d\n", kor);
           System.out.printf("\t영어: %d\n", eng);
           System.out.printf("\t수학: %d\n", math);
           System.out.println();
           System.out.printf("\t총점 : %d\n \t평균 : %2$.2f\n", total, avg);
           System.out.printf("─────────────\n");
           }
           
                
		
	}

	public static void 성적입력(int[] kors, int[] engs, int[] maths, int index) {
		
		Scanner scan = new Scanner(System.in);
		
		int kor =0;
		int eng =0;
		int math =0;
		
		
        System.out.println("┌───────────┐");
        System.out.println("│ 성적입력          │");
        System.out.println("└───────────┘");
        
     
     
           
           System.out.printf("%d 번 째 성적", index+1);
           
           System.out.print("\t국어:");
           kor = scan.nextInt();
           
           System.out.print("\t영어:");
           eng = scan.nextInt();
           
           System.out.print("\t수학:");
           math = scan.nextInt();
           
           kors[index]= kor;
           engs[index]= eng;
           maths[index]= math;
           index++;
         
	}

	public static int 메뉴입력() {
		
		int menu =0;
		Scanner scan = new Scanner(System.in);
		 System.out.println("┌───────────┐");
         System.out.println("│  메인 메뉴        │");
         System.out.println("└───────────┘");
         System.out.println("\t1.성적 입력");
         System.out.println("\t2.성적 출력");
         System.out.println("\t3.종료");
         System.out.print("\t선택>");
         menu = scan.nextInt();
		
		return menu;
	}

}

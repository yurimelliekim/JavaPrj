package ex6.array;

import java.util.Scanner;

public class WhileProgram2 {

	   public static void main(String[] args) {
	      
	// 시험 과목들
	      int kor=0;
	      int eng=0;
	      int math=0;
	      
	// 국어, 영어, 수학을 3개씩 저장할 수 있는 배열을 생성하시오.
	      int[] kors = new int[3];
	      int[] engs = new int[3];
	      int[] maths = new int[3];
	      int index = 0; // 데이터 관리를 위한 변수
	      

	// 시험 성적을 저장할 변수들
	      int total;
	      float avg;

	      
	// 시험성적 입력
	      
	      Scanner scan = new Scanner(System.in);

	      
	      // 메뉴 추가
	      
	      int menu = 0;
	      
	/*-------------------------------------------------------------------------------------------*/
	      
	      //break 라벨로 벗어나기
	      벗어나고파:
	      
	      //   반복제어
	      while(true)
	         {
	                  System.out.println("┌───────────┐");
	                  System.out.println("│  메인 메뉴        │");
	                  System.out.println("└───────────┘");
	                  System.out.println("\t1.성적 입력");
	                  System.out.println("\t2.성적 출력");
	                  System.out.println("\t3.종료");
	                  System.out.print("\t선택>");
	                  menu = scan.nextInt();
	      switch(menu){            
	      
	         case 1:
	                  
	                  //성적 입력
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
	                     
	                     
	                     
	               /*      if(kor<0 || kor>100)
	                        System.out.println("성적의 범위(0~100)를 벗어났습니다.");
	                     if(eng<0 || eng>100)
	                        System.out.println("성적의 범위(0~100)를 벗어났습니다.");
	                     if(math<0 || math>100)
	                        System.out.println("성적의 범위(0~100)를 벗어났습니다.");
	                  }      
	                     while(kor<0 || kor>100 || eng<0 || eng>100 || math<0|| math>100);*/
	                     
	                     
	                  /*do
	                  {
	                     System.out.printf("%d 번째 성적\n", engs[i+1]);
	                     System.out.print("\t영어:");
	                     eng = scan.nextInt();
	                     if(eng<0 || eng>100)
	                        System.out.println("성적의 범위(0~100)를 벗어났습니다.");
	                  }   
	                  while(eng<0 || eng>100);
	                        
	                  do
	                  {
	                     System.out.printf("%d 번째 성적\n", maths[]);
	                     System.out.print("\t수학:");
	                     math = scan.nextInt();
	                     if(math<0 || math>100)
	                        System.out.println("성적의 범위(0~100)를 벗어났습니다.");
	                  }
	                     
	                  while(math<0 || math>100);*/
	                        
	                  
	                  
	                  break;      
	                  
	         case 2:
	            
	                  // 총점 평균 계산
	                  for(int i=0; i<index; i++)   {
	            
	                     kor=kors[i];
	                     eng=engs[i];
	                     math=maths[i];
	                     
	                     total = kor + eng + math;
	                     avg = total / 3;
	                     
	                  System.out.println("┌───────────┐");
	                  System.out.println("│  성적출력          │");
	                  System.out.println("└───────────┘");
	                  System.out.printf("\t국어: %d\n", kor);
	                  System.out.printf("\t영어: %d\n", eng);
	                  System.out.printf("\t수학: %d\n", math);
	                  System.out.println();
	                  /*System.out.printf("\t총점: %d\n", total);
	                  System.out.printf("\t평균: %.2f\n", avg);*/
	                  System.out.printf("\t총점 : %d\n \t평균 : %2$.2f\n", total, avg);
	                  System.out.printf("─────────────\n");
	                  }
	                  
	                  break;         
	      
	         case 3:
	         
	                  // 종료
	                  break 벗어나고파;
	            
	            
	         
	         default:
	                  // 메뉴 이외의 것을 선택시
	                  System.out.println("\t\"메뉴의 범위를 벗어났습니다.\"");
	                     }
	         }

	   }
}
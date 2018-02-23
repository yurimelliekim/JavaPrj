package ex4.test;

public class Test1Program {

	public static void main(String[] args) {
		//1.반복
		for(int i=0; i<10; i++) 		
			System.out.printf("%d",1);
		
		System.out.println(" ");
		
		for(int i=0; i<10; i++)
			System.out.printf("%d",1+i);
			System.out.println(" ");
		
		//문제3 숙제
		//위의 문장의 결과가 12345678910->10987654321 이 되도록 수정하시오
		for(int i=0; i<10; i++)
			System.out.printf("%d",10-i);
		System.out.println(" ");
		
		//2.중첩
		//문제4 다음문장의 결과는 12345678910이다. 이 결과가 5번 반복되도록 하시오
		for(int i=0; i<5; i++) 
			for(int j=0; j<10; j++)
				System.out.printf("%d",1+j);
		
		/*숙제 12345678910
		     12345678910
		     12345678910
		     12345678910
		     12345678910*/    
		
		for(int i=0; i<5; i++) { 
			for(int j=0; j<10; j++)
				System.out.printf("%d",1+j);
				System.out.println("");
		}
				
		//숙제 1 2 3 4 5 6 7 8 9 10
		//     11 12 13
		//                          50
							
		for(int j=0; j<5; j++) {	
			
			for(int i=0; i<10; i++)
				System.out.printf("%3d",10*j+i+1);
				System.out.println("");
		}

			 
		//3.반복 중에 선택
		//위의 코드에서 홀수에 해당하는 위치는 []괄호로 출력하는 코드를 작성하시오.
		
		for(int j=0; j<5; j++) {				
			for(int i=0; i<10; i++) {
				if (i%2==0)
					System.out.printf("[%3d]",10*j+i+1);//홀수, 특수한 상황
				else 
					System.out.printf("%3d",10*j+i+1);//기본으로 까는 값
			}
			System.out.println();
		}

		
		for(int j=0; j<5; j++) {				
			for(int i=0; i<10; i++) {
				if ((10*j+i+1)%2==1)
					System.out.printf("[]",10*j+i+1);//홀수, 특수한 상황
				else 
					System.out.printf("%3d",10*j+i+1);//기본으로 까는 값
			}
			System.out.println();
		}
		
		
		//위의 코드에서 홀수면서 3배수위치에는 별(*)을 출력하시오
		
		for(int j=0; j<5; j++) {				
			for(int i=0; i<10; i++) {
				if ((10*j+i+1)%2==1 && (10*j+i+1)%3==0)
					System.out.printf(" * ",10*j+i+1);
				else 
					System.out.printf("%3d",10*j+i+1);//기본으로 까는 값
			}
			System.out.println();
		}
		
		for(int j=0; j<5; j++) {				
			for(int i=0; i<10; i++) {
				if ((10*j+i+1)%2==1 && (10*j+i+1)%3==0)//가장 특수한 경우가 맨 위에 옴
					System.out.printf(" * ");
				else if ((10*j+i+1)%2==1)
					System.out.printf(" []");//홀수, 특수한 상황
				else	
				System.out.printf("%3d ",10*j+i+1);//기본으로 까는 값
			}
			System.out.println();
		}
		
		
		
		

	}

}

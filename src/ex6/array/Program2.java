package ex6.array;

public class Program2 {

	public static void main(String[] args) {
		
		//board라는 이름으로 정수 30개의 배열을 마련해 주세요
		//int[] board= new int[30];
		
		//board라는 이름으로 문자형식 30개의 배열을 마련해 주세요
		//char[] board = new char[30];
		
	//board의 모든 공간에 ┼ 문자를 입력하시오.
	/*	char[] board = new char[30];
		for(int i=0 ; i<30; i++) 
			board[i]= '┼';*/
			
	//board의 모든 공간의 문자를 출력하시오. 단, 5개씩 끊어서 내려쓰기를 포함시키시오.
		/*char[] board = new char[30];
		  for(int i=0 ; i<30; i++) {
			int num = i+1;
			board[i]= '┼';
			System.out.printf(" %c",board[i]);
			
			if(num%5==0)
				System.out.println("");
		}*/
	//위의코드를 이용해서 이 모양이 다음처럼 출력되는코드를 작성하시오
		
	  /* ○ ┼ ┼ ┼ ┼
		 ┼ ○ ┼ ┼ ┼
		 ┼ ┼ ○ ┼ ┼
		 ┼ ┼ ┼ ○ ┼
		 ┼ ┼ ┼ ┼ ○
		 ┼ ┼ ┼ ┼ ┼*/
	/*	char[] board = new char[30];
		for(int i=0 ; i<30; i++) {
			int num = i+1;
			board[i]= '┼';
			
			if(num%6==1) //1 7 13 19.... 공차가 6인 수열, an=1+(n-1)*6
				System.out.printf("○");//특수경우
			else
			System.out.printf("%c",board[i]);//기본
			
			if(num%5==0)
				System.out.println("");
		}*/
			
/*		char[] board = new char[30];
		for(int i=0,n=1 ; i<30; i++) {
			int num = i+1;
			board[i]= '┼';
			int an = 1+(n-1)*6;//초항을 초기값으로 대입, 그런데 이렇게 변수를 선언하면 이 변수의 값은 반복할 떄마다 매번 1로 초기화 되므로, for문의 초기값 대입하는
								//위치에 선언하는 것이 바람직하다.그러고서 n++;를 넣는다.
			if(an == num) { //1 7 13 19.... 공차가 6인 수열, an=1+(n-1)*6
				System.out.printf("○");//특수경우
				n++;
			}
			else 
			System.out.printf("%c",board[i]);//기본
			
			if(num%5==0)
				System.out.println("");
		}*/
		
	//현재 배열은 다음과 같은 상태로 초기화가 되어 있다.
		/*char[] board = new char[30];
		for(int i=0 ; i<30; i++) {
			int num = i+1;
			board[i]= '┼';
			System.out.printf(" %c",board[i]);
			
			if(num%5==0)
				System.out.println("");
		}*/
	//위의 배열을 다음과 같은 상태가 되도록 ○문자를 대입하시오.
		/*
		○┼┼┼┼
		┼○┼┼┼
		┼┼○┼┼
		┼┼┼○┼
		┼┼┼┼○
		┼┼┼┼┼*/
		
/*		char[] board = new char[30];
		
		for(int i=0 ; i<30; i++) {
			int num = i+1;
			if(num%6==1)
				board[i]='○';
			else
				board[i]= '┼';
			System.out.printf(" %c",board[i]);
			
			if(num%5==0)
				System.out.println("");
		}*/

		/*char[] board = new char[30];
		
		for(int i=0 ; i<30; i++) {
			int num = i+1;
			if(num%6==1)
				board[i]='○';
			else
				board[i]= '┼';
		}
		for(int i=0 ; i<30; i++){	
			int num = i+1;
			System.out.printf(" %c",board[i]);
			
			if(num%5==0)
				System.out.println("");
		}*/
		
		
	/*	char[] board = new char[30];
		for(int i=0 ; i<30; i++) 
			board[i]= '┼';
		
		for(int i=0 ; i<5; i++) 
			board[i*6]='○';
	
		for(int i=0 ; i<30; i++){	
			int num = i+1;
			System.out.printf(" %c",board[i]);
			
			if(num%5==0)
				System.out.println("");
		}*/
		
/*		char[] board = new char[30];
		for(int i=0 ; i<30; i++) 
			board[i]= '┼';
		
		int x=3;
		int y=4;
		board[(x-1)+(y-1)*5]='○';//x로 3만큼, y로 4만큼이동한 것에 ○저장됨.
		
		
		for(int i=0 ; i<30; i++){	
			int num = i+1;
			System.out.printf(" %c",board[i]);
			
			if(num%5==0)
				System.out.println("");
		
		}*/
/*2차배열-------------------------------------------------------------------------------------------------*/
		char[][] board = new char[6][5];
		
		for(int y=0 ; y<6; y++)
			for(int x=0; x<5; x++)
			board[y][x]= '┼';
		
/*-----------------------------------------------------------*/
		//board[3][2]='○';
		
		
		/*for(int y=1;y<=6;y++)
			for(int x=1;x<=5;x++)
				if(y==x)
					board[y-1][x-1]='○';*/
		
		
/*숙제	 ○ ┼ ┼ ┼ ┼
		 ┼ ○ ┼ ┼ ┼
		 ┼ ┼ ○ ┼ ┼
		 ┼ ○ ┼ ┼ ┼
		 ○ ┼ ┼ ┼ ┼
		 ┼ ┼ ┼ ┼ ┼*/
		for(int y=1;y<=6;y++) 
			for(int x=1;x<=5;x++)
				if((y==x||y==-x+6) && x<=3)
					board[y-1][x-1]='○';
/*----------------------------------------------------------*/		
		for(int y=0 ; y<6; y++){
			for(int x=0; x<5; x++)
			System.out.printf(" %c",board[y][x]);
			
				System.out.println("");
		}
		
		
		
		
		
	
	}

}

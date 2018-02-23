package Practice;

public class Array2 {

	public static void main(String[] args) {
		char[][] board = new char[20][20];
			for(int y=0;y<20;y++)
				for(int x=0;x<20;x++)
					board[y][x] = '┼';
			
			/*for(int y=0;y<6;y++)
				for(int x=0;x<5;x++)
					if(x==y)
						board[y][x] = '0';*/
			/*for(int y=1;y<=6;y++)
				for(int x=1;x<=5;x++)
					if(y==x)
						board[y-1][x-1]='0';*/
			/*for(int y=1;y<=6;y++)
				for(int x=1; x<=5;x++)
					if((y==-x+6 || y==x)&&(x<=3))
						board[y-1][x-1]='0';*/
			
			for(int y=1;y<=20;y++)  
				for(int x=1;x<=20;x++)
				
					//int r = 5;
					if(((y-10)*(y-10)+(x-10)*(x-10))==25)
						board[y-1][x-1]='0';
						System.out.println();
			
			

			for(int y=0;y<20;y++) {
				for(int x=0;x<20;x++)
					System.out.printf(" %c",board[y][x]);
				System.out.println("");
	
			}
					
					
					
					
					
	}

}

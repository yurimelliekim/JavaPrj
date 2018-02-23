import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {
	
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		
		Random 성래 = new Random();
		
		num1 = 성래.nextInt(45)+1;
		num2 = 성래.nextInt(45)+1;
		
		System.out.printf("%d, %d, %d, %d, %d, %d\n", num1, num2, num3, num4, num5, num6);
		

	}

}

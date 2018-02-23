package Pr;

public class Calculator {
	
	

	public static void main(String[] args) {
		
		
		try {
			printResult(5,8);
		}
		catch(Exception e) {
		System.out.println("종룟");
	}
	}
	public static void printResult(int x, int y) throws 빼기가음수가되는예외 {
		System.out.println(Calculator.sub(x,y));
		System.out.println(Calculator.div(x,y));
	}

	public static int sub(int x, int y) throws 빼기가음수가되는예외 {
		int result;
		result = x-y;
		
		if (result<0)
			throw new 빼기가음수가되는예외();
		return result;
	}

	public static int div(int x, int y) {
		int result;
		result = x/y;
		return result;
	}

}

package ex11.except;

public class Calculator {

	public static int add(int x,int y) throws y값에음수를입력하는예외 {
	
		if(y<0)
			throw new y값에음수를입력하는예외();
		int result = x+y;
		return result;
	}
	
	public static int sub(int x, int y) {
		int result = x-y;
		return result;
	}
	
}

package ex11.except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
/*
	public static void main(String[] args)throws Exception {
	
		saveExamToFile();
		
		System.out.println("program end");
		}
		
		private static void saveExamToFile() throws Exception {
			FileInputStream fis = null;
			int x =3;
			int y =-1;
			
			int z = Calculator.add(x, y);
			fis = new FileInputStream("res/test1.txt");
			fis.close();
			
		}
		*/
	
	public static void main(String[] args) {
		
		
		saveExamToFile();
		
		System.out.println("program end");
				
	}

	private static void saveExamToFile() {
		
		int x =3;
		int y =0;
		FileInputStream fis = null;
		try {
			int z = x/y;			
		
			fis = new FileInputStream("res/test1.txt");
		}catch(FileNotFoundException e) {  //FileNotFoundException, Exception 부모자식관계 익셉션만해도되는데 안하는이유: 
			//e.printStackTrace();         //최상위익셉션,모든걸 다 받아들여서 특정 예외처리에만 반응할수가 없음.
			
		
		try {
			fis.close();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
			//System.out.println("이게 기본처리로직");
		}
	}
	
		catch(Exception e) {
		
		}
		finally {
			System.out.println("쏴리");	
		}
		//FileOutputStream fos = new FileOutputStream("c:\\test1.txt");
	}

	/*private static void saveExamToFile() throws Exception {
		FileInputStream fis = null;
		int x =3;
		int y =-1;
		
		int z = Calculator.add(x, y);
		fis = new FileInputStream("res/test1.txt");
		fis.close();
		
	}	*/

}


/*package ex11.except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Program {

	

	
	public static void main(String[] args)  {
		
		saveExamToFile();
		System.out.println("program end");
	}

	private static void saveExamToFile() {
		
		
		int x =3;
		int y =0;	
		try {
			int z = x/y;			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("res/test.txt");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("쏴리");
		}
		//FileOutputStream fos = new FileOutputStream("c://test.txt");
		
	}



}*/

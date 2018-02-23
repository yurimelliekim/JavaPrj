package ex11.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Program2 {

	public static void main(String[] args) {//collection의 세가지 list, set, map
	
		//0122
		
		
		
		
		/*
		String fileName1 = "photo.jpg";
		String fileName2 = "Photo.jpg";
		System.out.println(fileName1.equals(fileName2));//false대소문자구별함.
		 */		
		/*
		String fileName = "photo.jpg".toUpperCase();//cf.toLowerCase();
		System.out.println(fileName.equals("Photo.jpg".toUpperCase()));//false대소문자구별함.
		System.out.println(fileName);
		*/
		/*
		String 참석자명단 = "강호동, 유재석, 홍길동";//(Comma Separated Value:간단한것할때.)
		String[] names = 참석자명단.split(",");
		System.out.println(names[1]);
		*/
		
		/*
		String name1 ="아이유";//문자열 상수개체.
		String name2 ="아이유";
		String name3 =new String("아이유");//주소
		System.out.println(name1 == name2);//true
		System.out.println(name1 == name3);//false
		System.out.println(name1 == "아이유");//true
		System.out.println(name1.equals(name3));//값을 비교하는 equals! //true
		
		String fileName = "photo.jpg";
		System.out.println(fileName.length());//길이: 9
		System.out.println(fileName.indexOf("."));//.이 있는 곳의 위치가 몇번째인지:5
		System.out.println(fileName.substring(0,3));//파일명에서 3번째 문자까지만 출력:pho
		
		//문제.위의 파일명에서 점이 있는 곳까지의 문자열을 출력하시오.단,점(.)은 제외
		
		int a=fileName.indexOf(".");
		System.out.println(fileName.substring(0,a));
		
		String fileName2 = "photo.daniel.jpg";
		int b=fileName2.lastIndexOf(".");//뒤에부터 찾는다.
		System.out.println(fileName2.substring(0,b));
		*/
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		String temp = scan.next();
		//temp에 대한 검증
		boolean a = isNan(temp);
		int kor = Integer.parseInt(temp);//정수로 변한
		
	
		
		/*int x =3;
		String s = Integer.toString(x);//정수를 문자열로 변환.
		String s1 = String.valueOf(x);//위와같음
		
		int y = Integer.parseInt(s);//문자열을 숫자로.
		*/
		
		
		//0119
		/*Object obj = new Integer(3);//래핑 클래스, 박스화, 래핑. 3은정수라서 인티저.Object obj = 3;이라고하면안됨
		
		Integer m = new Integer(4);
		//Integer m = 4;//null됨,  인티져쓰는게좋음.주소있음,위어꺼랑같음.
		
		
		
		int m2 = 3; //null안됨.주소없음
		
		
		Object[] data = new Object[5];
		//data[0] = x;
		
		

		//int[] nums = new int[3];
		
		
		List<Integer> list = new ArrayList<>();//순차적,누적	List,Set,Map인터페이스임.
		list.add(3);
		list.add(4);
		list.add(3);
		
		//list.get(0);
		//list.get(1);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));//이거 와 같은방법을 Iterator를 사용하여 ↙
		
		 Iterator it1 =list.iterator();//import/     Iterator:순회자, 반복자, 열거자. **다음꺼나와!!!!**
		while(it1.hasNext())
			System.out.println(it1.next());
		
		//이터레터에 있는 리스트값을 가져와서 n에 둔다.이터렉터쓸때 오브젝트.
		for(Object n:list)//열거자//for-each문 
			System.out.println(n);
		
		
		System.out.println("-----------------------------------------");
		
		
		nums[2]= 3;//cf.3번째 방에 3을 입력하는거
		
		list.add(3);//차례대로 넣는다!
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		for(int i=0;i<list.size();i++)
			System.out.printf("%2d\n",list.get(i));
		
		//오브젝트형하면 <>안쓰기, null이가능한것만되서 래핑형으로써야함,.
		Set<Integer> set = new HashSet<Integer>();//누적이아님.데이터식별index가없음.데이터가 식별자임!!!!!같은값이 겹치지않게.데이터중복안하게.
								//get기능이없음.
		set.add(3);
		set.add(4);
		set.add(3);//클래스 객체로서 넣을 수도 있음 new AA()
		//set.add("hello");인티저가아니라서 안됨.
		
		Iterator it =set.iterator();//import
		while(it.hasNext())    //순회자.
			System.out.println(it.next());
		
		
		for(Integer n:set)//for-each문
			System.out.println(n++);//Set이인티져형으로 되어있으면 f++이 가능함.
		
		System.out.println("-----------------------------------------");
		
		Map<String, Object> map = new HashMap<>();//값과 키가 나눠져있음..별도의 태그와 같은 내용,특징을 넣을때
		map.put("이름","홍길동");
		map.put("나이",29);
		map.put("주소","그냥동");
		//        키      값
		
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		System.out.println(map.get("주소"));
		
		
		Set keySet = map.keySet();
		for(Object k : keySet) {
			System.out.println(k+":"+map.get(k));
		}*/
		

		
	}

	private static boolean isNan(String temp) {
		// TODO Auto-generated method stub
		return false;
	}

	


	
}

	



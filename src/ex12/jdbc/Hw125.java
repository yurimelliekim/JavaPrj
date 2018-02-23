package ex12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hw125 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Scanner scan = new Scanner(System.in);

		System.out.println("\t[회원 검색 프로그램]");
		
		System.out.printf("이름 검색어 입력:");
		String call = scan.next();
		System.out.println();
		
		
		String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '%"+call+"%'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		String url="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		//있어야할것.
		Connection con = DriverManager.getConnection(url,"c##sist","dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);//실행해서 결과넣기.
		
		
		
		String id;
		String name;
		String age;
		
		System.out.println("아이디           이름             나이");
		while(rs.next()) {
		
		id = rs.getString("MID");
		name = rs.getString("NAME");
		age = rs.getString("AGE");
		
		System.out.printf("%s\t\t %s\t\t  %s\t\t\n", id, name, age);
		}
		
		
		//반대로 닫고나오기
		rs.close();
		st.close();
		con.close();
		
	}
			

}



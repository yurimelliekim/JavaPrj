package ex12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
		//전화번호를 정규식으로
		
		String sql = "SELECT * FROM MEMBER WHERE REGEXP_LIKE (PHONE,'^01[017]-\\d{3,4}-\\d{4}$')";
		//String sql = "SELECT * FROM MEMBER WHERE ROWNUM BETWEEN 1 AND 5";
		//String sql = "SELECT * FROM MEMBER WHERE ROWNUM BETWEEN 6 AND 10";
				
				
		//String sql = "SELECT * FROM MEMBER";//이거를 가져오려고 밑에꺼 쓰는거임!!!!!
		//String sql = "SELECT * FROM MEMBER WHERE AGE<30";
		//String sql = "SELECT * FROM MEMBER WHERE AGE IS NULL";//널 비교는 반드시 IS를 써야함.
		//String sql = "SELECT * FROM MEMBER WHERE AGE BETWEEN 23 AND 25";
		//String sql = "SELECT * FROM MEMBER WHERE AGE NOT IN (20,25,27)";
		//String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '%박%'";
		//String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '_%바%_'";//_글자개수만큼
		//String sql = "SELECT * FROM MEMBER WHERE AGE IS NOT NULL";//널 비교는 반드시 IS를 써야함.
		//String sql = "SELECT * FROM MEMBER WHERE PWD ='122'";
		
		//┌이거 외울이유없음.
		
		//드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		
		//있어야할것.
		Connection con = DriverManager.getConnection(url,"c##sist","dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);//실행해서 결과넣기.
		
		//이거외울이유없음 ┘
		
		String id;
		String name;
		//rs.next();
		
		while(rs.next()) {
		
		id = rs.getString("ID");
		name = rs.getString("NAME");
		
		System.out.printf("id:%s, name:%s\n", id, name);
		}
		
		
		//반대로 닫고나오기
		rs.close();
		st.close();
		con.close();
		
		}
		/*String name;
		
		rs.next();//다음거가져옴 
		name = rs.getString("NAME");
		
		System.out.printf("name:%s\n",name);
		
		rs.next();//다음거가져옴 
		name = rs.getString("NAME");
		
		System.out.printf("name:%s\n",name);
		*/
			
		/*if(!con.isClosed())
			System.out.println("connected");
		//여기까지 연결함
		 */

	}



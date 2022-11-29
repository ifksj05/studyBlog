package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class DbStudy {
	private static Connection con;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";
		String id = "root";
		String pw = "1234";
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO `dbstudy`.`userinfo` (`name`, `h(m)`, `w(kg)`) VALUES ('김성재11', '1.8', '85');");

			ResultSet rs = stmt.executeQuery("SELECT * FROM dbstudy.userinfo;");
			
			
//			if(rs.next()) {
//				System.out.println("데이터 있음");
//			}else {
//				
//			}
			
			while(rs.next()) {
				for (int i = 1; i <= 4; i++) {
					System.out.print(rs.getObject(i) + " ");
					
				}
				System.out.println();
//				System.out.println(rs.getInt(1) + " "+ rs.getString(2) + " " + rs.getFloat(3));
			}
				
				
			
//			rs.next();
//			System.out.println(rs.next());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("접속 실패");
		}
		
		
	}
}

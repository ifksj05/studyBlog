package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	private String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
			+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";
	private String id = "root";
	private String pw = "1234";
	private Connection con;
	private Statement stmt;

	public DbManager() {
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 접속 성공");
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}

	public void setData(String sql) {
		// TODO Auto-generated method stub
		try {
			stmt.executeUpdate(sql);
			System.out.println("setData 실행");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("setData 메서드 오류");
			e.printStackTrace();
		}
	}

	public void getData(String sql) {
		// TODO Auto-generated method stub
		try {			
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("getData 실행");
			
			while (rs.next()) {
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					System.out.print(rs.getObject(i) + " ");
				}
				System.out.println();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("getData 메서드 오류");
			e.printStackTrace();
		}
	}

}

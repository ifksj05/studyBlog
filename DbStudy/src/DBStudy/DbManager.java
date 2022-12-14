package DBStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
	private Connection con;
	private String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
			+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";
	private String id = "root";
	private String pw = "1234";
	private Statement stmt;

	public DbManager() {
		// TODO Auto-generated constructor stub
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
			stmt = con.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setData(String sql) {
		// TODO Auto-generated method stub
		try {
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

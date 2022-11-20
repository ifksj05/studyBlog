package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class ToDoListDbManager {

   private static final String UAR = "jdbc:mysql://localhost/?CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
         + "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";
   private static final String ID = "root";
   private static final String PW = "1234";
   private Connection con;
   private PreparedStatement pstmt;

   public ToDoListDbManager() {
      // TODO Auto-generated constructor stub
      try {
         con = DriverManager.getConnection(UAR, ID, PW);

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public int setUpdata(String sql, Object... values) {
      // TODO Auto-generated method stub
      try {
         pstmt = con.prepareStatement(sql);

         int cnt = 1;
         for (Object value : values) {
            pstmt.setObject(cnt++, value);
         }
         System.out.println("접속성공");
         return pstmt.executeUpdate();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         System.out.println("오류");
         return 0;
      }
   }

   public Vector<Vector<String>> getData(String sql, Object... values) {
      // TODO Auto-generated method stub
      Vector<Vector<String>> data = new Vector<Vector<String>>();
      try {
         pstmt = con.prepareStatement(sql);

         int cnt = 1;
         for (Object value : values) {
            pstmt.setObject(cnt++, value);
         }
         ResultSet rs = pstmt.executeQuery();
         ResultSetMetaData rsmd = rs.getMetaData();

         while (rs.next()) {
            Vector<String> row = new Vector<String>();
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
               row.add(rs.getObject(i + 1) + "");
            }
            data.add(row);
         }
         return data;

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         return null;
      }
   }

}
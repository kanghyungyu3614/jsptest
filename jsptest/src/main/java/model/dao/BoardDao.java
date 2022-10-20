package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.IntBinaryOperator;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class BoardDao {
	BoardDao dao = new BoardDao();
	static Connection con;	 static PreparedStatement ps;	static ResultSet rs;
	public BoardDao() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsptest", 
					"root",
					"1234");
		}catch (Exception e) { System.out.println(e);}
	}
	
	public static boolean pushTable(String btitle,String bcontent,String bname,String bpassword) {
		String sql = "insert into board(btitle,bcontent,bname,bpassword) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcontent);
			ps.setString(3, bname);
			ps.setString(4, bpassword);
			return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
}

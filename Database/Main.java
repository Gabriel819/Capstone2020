package DBManagement;
import java.sql.*;
import DBManagement.*;

public class Main {
	private final static String driv = "com.mysql.cj.jdbc.Driver";
	private final static String DB_URL = //server ip address
	private final static String USER_NAME = // user_name
	private final static String PASSWORD = // password
	
	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName(driv);
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("[MySQL Connection ]\n");
			stmt = conn.createStatement();
			
			String usedb = "Use UniversityDB";
			stmt.execute(usedb);
			
			//Create_Table.CreateTable("UniversityDB",stmt, pstmt, conn);
			// insert.InsertMajorInfo(pstmt, conn, "1", "BASIC");
			//insert.InsertMajorInfo(pstmt, conn, "2", "CS");
			//insert.InsertMember(stmt, pstmt, conn, "2", "Mike", "CS", "010000000000", "abc@naver.com", "0", "mike123", "pw123", "Male", 
					//"Mikey", "000000", "000000");
			insert.InsertReqItem(stmt, pstmt, conn, "1", "tablet", "Mike");
			//insert.InsertItemInfo(stmt, pstmt, conn, "1", "tablet2", "1","10000");
			//insert.InsertMember(stmt, pstmt, conn, "1", "ADMIN", "BASIC", "0", "0", "0", "0", "0", "0", 
					//"0", "000000", "000000");
			
			//Create_Database_Table.CreateOrChangeDatabase("Universitydb", pstmt, conn);
			//Create_Table.CreateTable("Universitydb",stmt, pstmt, conn);
			//select.selectall(stmt, "member");
			//select.selectidx(stmt, "member", "USER_NAME", "Mike");
			
			//insert.InsertMember(pstmt, conn, "4", "Jenny", "PHILOSOPHY", "01055556666", "poi@daum.net", "0", "id3","pw3","female",
					//"nick2", "4");
			//insert.InsertItemInfo(pstmt, conn, "1", "ipad", "1", "2", null, null);
			//insert.InsertCategory(pstmt, conn, "ipad", "1", "10000");
			//insert.InsertReqItem(pstmt, conn, "1", "blanket", "6");
			//select.selectall(stmt, "req_item");
			
			//select.selectall(stmt, "ITEM_INFO");
			//delete.deleteidx(stmt, pstmt, conn, "ITEM_INFO", "ITEM_IDX", "2");
			//select.selectall(stmt, "ITEM_INFO");
			//show_table.Desc_Table(stmt, conn, "MEMBER");
			//show_table.Desc_Table(stmt, conn, "ITEM_INFO");
			//show_table.Desc_Table(stmt, conn, "CATEGORY");
			//show_table.Desc_Table(stmt, conn, "REQ_ITEM");
			
			stmt.close();
			conn.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			stmt.close();
			conn.close();
		}
		System.out.println("[MySQL Close]\n");
	}
}

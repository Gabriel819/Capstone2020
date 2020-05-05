package DBManagement;

import java.sql.*;

public class show_table {
	public static void Desc_Table(Statement stmt, Connection conn, String table) throws SQLException {
		String sql = "SELECT * FROM " + table;
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCnt = rsmd.getColumnCount(); // 컬럼의 수
		System.out.println("column number : "+columnCnt);
		
		for(int i = 1;i <= columnCnt; i++) {
			System.out.println(rsmd.getColumnName(i));
		}
		System.out.print('\n');
	}
}

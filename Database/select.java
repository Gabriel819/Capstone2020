package DBManagement;

import java.sql.*;

public class select {
	public static void selectall(Statement state, String table) throws SQLException {
		String sql;
		sql = "SELECT * FROM " + table;
		ResultSet rs = state.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCnt = rsmd.getColumnCount(); // 컬럼의 수
		
		for(int i = 1;i <= columnCnt; i++) {
			System.out.print(rsmd.getColumnName(i) + "  ");
		}
		System.out.print('\n');
		
		while(rs.next()) {
			for(int i = 1;i <= columnCnt; i++) {
				System.out.print(rs.getString(rsmd.getColumnName(i)) + "\t");
			}
			System.out.print('\n');
		}
		rs.close();
	}
	
	public static void selectidx(Statement state, String table, String param1, String param2) throws SQLException {
		// table에서 param1이라는 column이 param2라는 값을 가지고 있는 값을 출력
		String SQL = "SELECT * FROM " + table + " WHERE " + param1 +" = '" + param2 +"'";
		System.out.println(SQL);
		ResultSet rs = state.executeQuery(SQL);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCnt = rsmd.getColumnCount(); // 컬럼의 수
		System.out.print('\n');
		
		while(rs.next()) {
				for(int i = 1;i <= columnCnt; i++) {
					System.out.println(rsmd.getColumnName(i) + " : " +
							rs.getString(rsmd.getColumnName(i)));
				}
			System.out.print('\n');
		}
	}
}

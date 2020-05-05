package DBManagement;

import java.sql.*;

public class delete {
	public static void deleteidx(Statement state, PreparedStatement pstmt, Connection conn, String table, String column, String idx) throws SQLException {
		try {
			String SQL = "delete from " + table + " where " + column + " = ?";
		
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, idx);
			int r = pstmt.executeUpdate();
		
			System.out.println(column + "�� " + idx + "�� " + r + "���� �����Ǿ����ϴ�.");
		} catch(SQLException e) {
			System.out.println("[SQL Error : "+e.getMessage()+"]");
		}
	}
}

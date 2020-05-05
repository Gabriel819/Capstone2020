package DBManagement;

import java.sql.*;

public class insert {
	public static void InsertMember(Statement state, PreparedStatement pstmt, Connection conn, String idx, String name, String major_name, 
			String phone, String email, String point, String id, String pw, String gender, String nickname, 
			String start_date, String end_date) throws SQLException {
		String sql = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, idx);
        pstmt.setString(2, name);
        pstmt.setString(4, phone);
        pstmt.setString(5, email);
        pstmt.setString(6, point);
        pstmt.setString(7, id);
        pstmt.setString(8, pw);
        pstmt.setString(9, gender);
        pstmt.setString(10, nickname);
        pstmt.setString(11, start_date);
        pstmt.setString(12, end_date);
        
        String sql2 = "SELECT MAJOR_IDX FROM MAJOR_INFO WHERE MAJOR_NAME = '" + major_name +"'";
        ResultSet rs = state.executeQuery(sql2);
        
        while(rs.next()) {
        	String major_idx = rs.getString("MAJOR_IDX");
			pstmt.setString(3, major_idx);
			break;
        }
        
        int count = pstmt.executeUpdate();
        if( count == 0 ){
            System.out.println("데이터 입력 실패");
        }
        else{
            System.out.println("데이터 입력 성공");
        }
	}
	
	public static void InsertItemInfo(Statement state, PreparedStatement pstmt, Connection conn, String item_idx, String item_name,
			String item_num, String rent_price) throws SQLException {
		String sql = "INSERT INTO ITEM_INFO VALUES (?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, item_idx);
        pstmt.setString(2, item_name);
        pstmt.setString(3, item_num);
        pstmt.setString(4, "1"); // 막 물품이 추가되었을 때는 아무도 사용하고 있지 않으므로 ADMIN으로 사용자를 해놓는다.
        pstmt.setString(5, rent_price);
        /*
        String sql2 = "SELECT MAJOR_IDX FROM MAJOR_INFO WHERE MAJOR_NAME = 'BASIC'";
        ResultSet rs = state.executeQuery(sql2);
        
        while(rs.next()) {
        	String major_idx = rs.getString("MAJOR_IDX");
			pstmt.setString(3, major_idx);
			break;
        }
        */
        int count = pstmt.executeUpdate();
        if( count == 0 ){
            System.out.println("데이터 입력 실패");
        }
        else{
            System.out.println("데이터 입력 성공");
        }	
	}
	
	public static void InsertMajorInfo(PreparedStatement pstmt, Connection conn, String major_idx, String major_name) throws SQLException {
		String sql = "INSERT INTO MAJOR_INFO VALUES (?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, major_idx);
        pstmt.setString(2, major_name);
        
        int count = pstmt.executeUpdate();
        if( count == 0 ){
            System.out.println("데이터 입력 실패");
        }
        else{
            System.out.println("데이터 입력 성공");
        }
	}
	
	public static void InsertReqItem(Statement state, PreparedStatement pstmt, Connection conn, String SEQ, String REQ_ITEM_NAME, 
									String REQ_USER_NAME) throws SQLException {
		String sql = "INSERT INTO REQ_ITEM VALUES (?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, SEQ);
        pstmt.setString(2, REQ_ITEM_NAME);
        pstmt.setString(3, REQ_USER_NAME);
        
        String sql2 = "SELECT USER_IDX from MEMBER WHERE USER_NAME = '" + REQ_USER_NAME + "'";
        ResultSet rs = state.executeQuery(sql2);
        
        while(rs.next()) {
        	String REQ_USER_IDX = rs.getString("USER_IDX");
			pstmt.setString(4, REQ_USER_IDX);
			break;
        }
        
        int count = pstmt.executeUpdate();
        if( count == 0 ){
            System.out.println("데이터 입력 실패");
        }
        else{
            System.out.println("데이터 입력 성공");
        }
	}
}

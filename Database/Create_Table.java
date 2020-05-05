package DBManagement;

import java.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Create_Table {	
	static ResultSet rs, rs2;
	/*
	// 데이터베이스가 있는지 확인하고, 없으면 데이터베이스 생성 후 데이터베이스 전환
	public static void CreateOrChangeDatabase(String dbName, PreparedStatement pstmt, Connection conn) {
		try {
			String SQL = "SELECT * from Information_schema.SCHEMATA WHERE "
					+"SCHEMA_NAME = ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, dbName);
			rs = pstmt.executeQuery();
			
			// 데이터베이스가 없다면 데이터베이스 생성
			if (!rs.next()) {
				Statement stmt = conn.createStatement();
				String sql = "create database " + dbName;
				boolean re = stmt.execute(sql);
				if(!re)	System.out.println("데이터베이스 생성 실패 " + re);
				stmt.close();
			}
			
			// 데이터베이스를 변환 (use database)
			conn.setCatalog(dbName);
		} catch (Exception e) {
			System.out.println("CreateOrChangeDatabase err : " + e);
		}
	}
	
	public static void ShowTables(String DbName, Connection conn) {
		try {
			DatabaseMetaData d = conn.getMetaData();
			rs = d.getTables(DbName, "", "", new String[] {"TABLE"});
			while(rs.next()) {
				System.out.println("table names of " + DbName + " are "
						+ rs.getString(3));
			}
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	*/
	// 테이블이 있는지 확인하고 없으면 생성
	public static void CreateTable(String DbName, Statement stmt, PreparedStatement pstmt, Connection conn) {
		try {
			// 데이터 베이스 생성 및 전환
			//CreateOrChangeDatabase(DbName, pstmt, conn);
			
			String tableSQL = "CREATE TABLE IF NOT EXISTS MAJOR_INFO("
					 + "MAJOR_IDX INT NOT NULL AUTO_INCREMENT,"
					 + "MAJOR_NAME VARCHAR(30) NOT NULL,"
					 + "PRIMARY KEY(MAJOR_IDX)"
					 + ")CHARSET = utf8";
			stmt.execute(tableSQL);
			
			tableSQL = "CREATE TABLE IF NOT EXISTS MEMBER("
						 + "USER_IDX INT NOT NULL AUTO_INCREMENT,"
						 + "USER_NAME VARCHAR(20) NOT NULL,"
						 + "USER_MAJOR INT NOT NULL,"
						 + "USER_PHONE VARCHAR(20) NOT NULL,"
						 + "USER_EMAIL VARCHAR(100),"
						 + "USER_POINT INT DEFAULT 0,"
						 + "USER_ID VARCHAR(20) NOT NULL,"
						 + "USER_PW VARCHAR(20) NOT NULL,"
						 + "USER_GENDER VARCHAR(7),"
						 + "USER_NICKNAME VARCHAR(10) NOT NULL,"
						 + "START_DATE VARCHAR(6),"
						 + "END_DATE VARCHAR(6),"
						 + "PRIMARY KEY(USER_IDX),"
						 + "FOREIGN KEY (USER_MAJOR) REFERENCES MAJOR_INFO (MAJOR_IDX)"
						 + ")CHARSET = utf8";
			stmt.execute(tableSQL);
			
			tableSQL = "CREATE TABLE IF NOT EXISTS ITEM_INFO("
					 + "ITEM_IDX INT NOT NULL AUTO_INCREMENT,"
					 + "ITEM_NAME VARCHAR(20) NOT NULL,"
					 + "ITEM_NUM INT DEFAULT 0,"
					 + "USER_IDX INT,"
					 + "RENT_PRICE INT NOT NULL,"
					 + "PRIMARY KEY(ITEM_IDX),"
					 + "FOREIGN KEY (USER_IDX) REFERENCES MEMBER (USER_IDX)"
					 + ")CHARSET = utf8";
			stmt.execute(tableSQL);
			
			tableSQL = "CREATE TABLE IF NOT EXISTS REQ_ITEM("
					 + "SEQ INT NOT NULL AUTO_INCREMENT,"
					 + "REQ_ITEM_NAME VARCHAR(20) NOT NULL,"
					 + "REQ_USER_NAME VARCHAR(20) NOT NULL,"
					 + "REQ_USER_IDX INT NOT NULL,"
					 + "FOREIGN KEY (REQ_USER_IDX) REFERENCES MEMBER (USER_IDX),"
					 + "PRIMARY KEY(SEQ)"
					 + ")CHARSET = utf8";
			stmt.execute(tableSQL);
			
			System.out.println("테이블 생성 완료");
			
			
			/*
			// information_schema.tables로부터 테이블의 존재 유무 확인
			String tableSql = "SELECT table_name FROM information_schema where table_schema = ?"
					+" and table_name = ?";
			
			pstmt = conn.prepareStatement(tableSql);
			pstmt.setString(1, DbName);
			pstmt.setString(2, tName);
			rs = pstmt.executeQuery();
			
			// 테이블이 없다면 테이블 생성
			if (!rs.next()) {
				Statement stmt = conn.createStatement();
				sql = "CREATE TABLE " + tName
							 + "("
							 + "no int primary key auto_increment,"
							 + "name varchar(10)"
							 + ")";
				rs2 = stmt.executeQuery(sql);
				stmt.close();
				System.out.println(rs2);						
			}
			*/
		} catch(Exception e) {
			System.out.println("CreateTable err : " + e);
		}
	}
}

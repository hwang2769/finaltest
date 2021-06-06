package finaltest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllDAO {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public Connection connect() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc.mysql://localhost:3306:schedule","root","jiwon2769");
			st = con.createStatement();			
		}catch(Exception e) {    //예외가 발생할 경우 예외를 처리해줌
			System.out.print("ProDAO: connect error" +e.getMessage());
	}
		return con;
	}

	public boolean isPro(String ProID, String ProPassword, String ProName) {
		try
		{
			String SQL = "SELECT *FROM PROF WHERE ProID = " + ProID + "and ProPassword = " + ProPassword+ " and ProName=" + ProName;
			rs = st.executeQuery(SQL);
			if(rs.next())
			{
				return true;
			}	
		}
		catch (Exception e)
		{
			 System.out.println("databases error : "  + e.getMessage());
		}
		return false;
	}
}


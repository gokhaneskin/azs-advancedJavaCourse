package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
	
	private final String url= "jdbc:h2:~/";
	private final String dbName="deneme";
	private final String userName="as";
	private final String userPass="as";
	private final String driver="org.h2.Driver";
	
	private Connection connection=null;
	private PreparedStatement preparedStatement=null;
	
	public DB() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url+dbName, userName, userPass);
		} catch (Exception e) {
			System.err.println("Connection Error : "+ e);
		}
	}
	
	public PreparedStatement pre(String query) {
		try {
			preparedStatement=connection.prepareStatement(query);
		} catch (Exception e) {
			System.err.println("PreparedStatement Error"+ e);
		}
		return preparedStatement;
	}
}

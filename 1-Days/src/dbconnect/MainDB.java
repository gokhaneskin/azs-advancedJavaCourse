package dbconnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainDB {

	public static void main(String[] args) throws Exception{

		DB db= new DB();
//		String query="create table user(uid int auto_increment, name varchar(255),surname varchar(255) ); ";
//		db.pre(query).execute();
//		
//		String name="Ali";
//		String surname="Veli";
//		String  query= "insert into user values( null,?,?)";
//		PreparedStatement preparedStatement = db.pre(query);
//		preparedStatement.setString(1, name);
//		preparedStatement.setString(2, surname);
//		int status = preparedStatement.executeUpdate();
//		System.out.println("status : "+ status);
//		
		
		//select
		String name="Ali";
		String queryString = "select * from user where name= ?";
		PreparedStatement preparedStatement2=db.pre(queryString);
		preparedStatement2.setString(1, name);;
		ResultSet resultSet=preparedStatement2.executeQuery();
		while(resultSet.next()) {
			System.out.println("Name : "+ resultSet.getString("name")+" Surname : "+resultSet.getString("surname"));
		}
	}

}

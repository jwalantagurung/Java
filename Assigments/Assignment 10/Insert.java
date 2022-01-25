import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");

		Statement st = con.createStatement();

		String query = "INSERT INTO user (`username`, `email`, `password`, `number`) VALUES" + "('Sumin', 'grgsumin666@gmail.com', 'sumin321', 9816649863)";

		int rows = st.executeUpdate(query);
		
		System.out.println("Added Successfully");

		con.close();
		
	}

}